package dao;

import model.User;
import model.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public boolean addUser(User user) {
        String sql = "INSERT INTO users (username, pin, role, account_balance) VALUES (?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPin());
            pstmt.setString(3, user.getRole());
            pstmt.setDouble(4, user.getAccount().getBalance());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User authenticateUser(String username, String pin) {
        String sql = "SELECT id, username, pin, role, account_balance FROM users WHERE username = ? AND pin = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, pin);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getDouble("account_balance"));
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("pin"), rs.getString("role"), account);
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, username, pin, role, account_balance FROM users";
        try (Connection conn = DataBaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Account account = new Account(rs.getDouble("account_balance"));
                users.add(new User(rs.getInt("id"), rs.getString("username"), rs.getString("pin"), rs.getString("role"), account));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean updateAccountBalance(int userId, double newBalance) {
        String sql = "UPDATE users SET account_balance = ? WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, newBalance);
            pstmt.setInt(2, userId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePin(int userId, String newPin) {
        String sql = "UPDATE users SET pin = ? WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newPin);
            pstmt.setInt(2, userId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUser(int userId) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public User getUserById(int userId) {
        String sql = "SELECT id, username, pin, role, account_balance FROM users WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getDouble("account_balance"));
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("pin"), rs.getString("role"), account);
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}