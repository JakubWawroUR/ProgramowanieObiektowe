package model;

public class User {
    private int id;
    private String username;
    private String pin;
    private String role;
    private Account account;

    public User(int id, String username, String pin, String role, Account account) {
        this.id = id;
        this.username = username;
        this.pin = pin;
        this.role = role;
        this.account = account;
    }

    public User(String username, String pin, String role, Account account) {
        this.username = username;
        this.pin = pin;
        this.role = role;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPin() {
        return pin;
    }

    public String getRole() {
        return role;
    }

    public Account getAccount() {
        return account;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}