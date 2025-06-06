import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample extends JFrame {
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JButton OKButton;
    private JLabel imageLabel;
    private JButton closeButton;
    private JButton backButton;

    public RadioButtonExample() {
        super("Przykład");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null); // Wyśrodkowanie okna

        // Grupowanie przycisków radiowych
        ButtonGroup group = new ButtonGroup();
        group.add(linuxRadioButton);
        group.add(windowsRadioButton);
        group.add(macintoshRadioButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu(); // Zakładam, że masz taką klasę
                menu.setVisible(true);
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Zamknięcie okna
            }
        });

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                if (linuxRadioButton.isSelected()) {
                    text = "Linux";
                } else if (windowsRadioButton.isSelected()) {
                    text = "Windows";
                } else if (macintoshRadioButton.isSelected()) {
                    text = "Macintosh";
                }

                JOptionPane.showMessageDialog(null, "Wybrano: " + text);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonExample frame = new RadioButtonExample();
            frame.setVisible(true);
        });
    }
}
