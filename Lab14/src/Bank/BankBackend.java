package Bank;

import dao.UserDAO;
import model.User;
import model.Account;

public class BankBackend {
    private UserDAO userDAO;

    public BankBackend() {
        this.userDAO = new UserDAO();
    }

    public User login(String username, String pin) {
        User user = userDAO.authenticateUser(username, pin);
        if (user != null) {
            System.out.println("Zalogowano jako: " + user.getUsername() + " (" + user.getRole() + ")");
        } else {
            System.out.println("Błędny login lub PIN.");
        }
        return user;
    }

    public boolean registerUser(String username, String pin, String role, double initialBalance) {
        if (!role.equals("admin") && !role.equals("customer")) {
            System.out.println("Nieprawidłowa rola. Dostępne role: admin, customer.");
            return false;
        }
        Account newAccount = new Account(initialBalance);
        User newUser = new User(username, pin, role, newAccount);
        if (userDAO.addUser(newUser)) {
            System.out.println("Użytkownik " + username + " zarejestrowany pomyślnie.");
            return true;
        } else {
            System.out.println("Błąd podczas rejestracji użytkownika.");
            return false;
        }
    }

    public boolean deposit(User user, double amount) {
        if (amount <= 0) {
            System.out.println("Kwota wpłaty musi być dodatnia.");
            return false;
        }
        double currentBalance = user.getAccount().getBalance();
        user.getAccount().deposit(amount);
        if (userDAO.updateAccountBalance(user.getId(), user.getAccount().getBalance())) {
            System.out.println("Wpłacono " + amount + ". Nowe saldo: " + user.getAccount().getBalance());
            return true;
        } else {
            user.getAccount().setBalance(currentBalance);
            System.out.println("Błąd podczas wpłaty środków.");
            return false;
        }
    }

    public boolean withdraw(User user, double amount) {
        if (amount <= 0) {
            System.out.println("Kwota wypłaty musi być dodatnia.");
            return false;
        }
        double currentBalance = user.getAccount().getBalance();
        if (user.getAccount().withdraw(amount)) {
            if (userDAO.updateAccountBalance(user.getId(), user.getAccount().getBalance())) {
                System.out.println("Wypłacono " + amount + ". Nowe saldo: " + user.getAccount().getBalance());
                return true;
            } else {
                user.getAccount().setBalance(currentBalance);
                System.out.println("Błąd podczas wypłaty środków.");
                return false;
            }
        } else {
            System.out.println("Niewystarczające środki na koncie.");
            return false;
        }
    }

    public double checkBalance(User user) {
        User updatedUser = userDAO.getUserById(user.getId());
        if (updatedUser != null) {
            user.setAccount(updatedUser.getAccount());
            return user.getAccount().getBalance();
        }
        return -1;
    }

    public boolean changePin(User user, String newPin) {
        if (userDAO.updatePin(user.getId(), newPin)) {
            user.setPin(newPin);
            System.out.println("PIN zmieniony pomyślnie.");
            return true;
        } else {
            System.out.println("Błąd podczas zmiany PINu.");
            return false;
        }
    }
}