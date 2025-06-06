package Bank;

import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankUI {
    private BankBackend bankBackend;
    private Scanner scanner;
    private User currentUser;

    public BankUI() {
        this.bankBackend = new BankBackend();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Witamy w systemie bankowym!");
        while (true) {
            System.out.println("\n--- Logowanie ---");
            System.out.print("Podaj nazwę użytkownika: ");
            String username = scanner.nextLine();
            System.out.print("Podaj PIN: ");
            String pin = scanner.nextLine();

            currentUser = bankBackend.login(username, pin);

            if (currentUser != null) {
                if (currentUser.getRole().equals("admin")) {
                    showAdminMenu();
                } else if (currentUser.getRole().equals("customer")) {
                    showCustomerMenu();
                }
            } else {
                System.out.println("Błędny login lub PIN.");
            }
        }
    }

    private void showAdminMenu() {
        while (true) {
            System.out.println("\n--- Menu Administratora ---");
            System.out.println("1. Zarejestruj nowego użytkownika");
            System.out.println("2. Wyloguj");
            System.out.print("Wybierz opcję: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerNewUser();
                    break;
                case "2":
                    System.out.println("Wylogowano administratora.");
                    currentUser = null;
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        }
    }

    private void registerNewUser() {
        System.out.print("Podaj nazwę użytkownika dla nowego konta: ");
        String username = scanner.nextLine();
        System.out.print("Podaj PIN dla nowego konta: ");
        String pin = scanner.nextLine();
        System.out.print("Podaj rolę (admin/customer): ");
        String role = scanner.nextLine();
        System.out.print("Podaj początkowe saldo: ");
        double initialBalance = getDoubleInput();
        if (initialBalance == -1) return;

        bankBackend.registerUser(username, pin, role, initialBalance);
    }

    private void showCustomerMenu() {
        while (true) {
            System.out.println("\n--- Menu Użytkownika ---");
            System.out.println("1. Wpłata pieniędzy");
            System.out.println("2. Wypłata pieniędzy");
            System.out.println("3. Sprawdź saldo");
            System.out.println("4. Zmień PIN");
            System.out.println("5. Wyloguj");
            System.out.print("Wybierz opcję: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    depositFunds();
                    break;
                case "2":
                    withdrawFunds();
                    break;
                case "3":
                    checkBalance();
                    break;
                case "4":
                    changePin();
                    break;
                case "5":
                    System.out.println("Wylogowano użytkownika.");
                    currentUser = null;
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        }
    }

    private void depositFunds() {
        System.out.print("Podaj kwotę do wpłaty: ");
        double amount = getDoubleInput();
        if (amount == -1) return;
        bankBackend.deposit(currentUser, amount);
    }

    private void withdrawFunds() {
        System.out.print("Podaj kwotę do wypłaty: ");
        double amount = getDoubleInput();
        if (amount == -1) return;
        bankBackend.withdraw(currentUser, amount);
    }

    private void checkBalance() {
        double balance = bankBackend.checkBalance(currentUser);
        if (balance != -1) {
            System.out.println("Twoje aktualne saldo: " + balance);
        } else {
            System.out.println("Nie udało się pobrać salda.");
        }
    }

    private void changePin() {
        System.out.print("Podaj nowy PIN: ");
        String newPin = scanner.nextLine();
        bankBackend.changePin(currentUser, newPin);
    }

    private double getDoubleInput() {
        try {
            double value = scanner.nextDouble();
            scanner.nextLine();
            return value;
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowy format. Wprowadź liczbę.");
            scanner.nextLine();
            return -1;
        }
    }
}