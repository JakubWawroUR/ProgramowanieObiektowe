import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDA0 {

    public boolean authUser(String username,String pin,String role) throws SQLException{
        String sql = "SELECT * FROM users WHERE username = ? AND pin = ? AND role = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1,username);
                stmt.setString(2,pin);
                stmt.setString(3,role);
                ResultSet rs = stmt.executeQuery();
                return rs.next();
        }
    }
    public void addUser(String username, String pin) {
        String sql = "INSERT INTO person (firstName, lastName, age) VALUES (?, ?, 0,'user')";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, pin);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deposit(String username,double amount) throws SQLException{
        String sql = "UPDATE users SET balance = balance + ? WHERE username = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, amount);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
            System.out.println("Wypłata zakończona sukcesem!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void withdraw(String username,double amount) throws SQLException{
        String checkSQL = "SELECT balance FROM users WHERE username = ?";
        String updateSQL = "UPDATE users SET balance = balance - ? WHERE username = ?";
        try(Connection conn = DBConnection.getConnection();
        PreparedStatement checkStmt = conn.prepareStatement(checkSQL)){
        ResultSet rs = checkStmt.executeQuery();
        if(rs.next() && rs.getDouble("balance")>=amount){
            try(PreparedStatement updateStmt = conn.prepareStatement(updateSQL)){
              updateStmt.setDouble(1,amount);
              updateStmt.setString(2,username);
              updateStmt.executeUpdate();
                System.out.println("Wypłata zakończona sukcesem!");
            }
        }
    }
    public void showBalance(String username) throws SQLException{
            String sql = "SELECT balance FROM users WHERE username = ?";
            try(Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1,username);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    System.out.println("Twoje saldo: " + rs.getDouble("balance" + "PLN"));
                }
            }
        }
    public void changePIN(String username,String newPin) throws SQLException{
            String sql = "UPDATE users SET pin = ? WHERE username = ?";
            try(Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1,newPin);
                stmt.se
            }
        }
    }

}