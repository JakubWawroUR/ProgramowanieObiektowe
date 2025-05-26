import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JTextField loginUser;
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton closeButton;
    private JLabel outputLabel;

    String user = "admin", password = "admin";

    public LoginForm() {
        super("Login");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width,height);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameInput = loginUser.getText();
                String passwordInput = new String(passwordField1.getPassword());
                if(userNameInput.equals(user) && passwordInput.equals(password)) {
                    outputLabel.setText("Zalogowano do systemu! Witaj "+userNameInput);
                } else {
                    outputLabel.setText("Podano błędne dane! Spróbuj ponownie");
                    loginUser.setText("");
                    passwordField1.setText("");
                }

            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
