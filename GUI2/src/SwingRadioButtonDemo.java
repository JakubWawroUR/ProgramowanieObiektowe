import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class SwingRadioButtonDemo extends JFrame {
    private JPanel mainPanel;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel imageLabel;
    private JButton okButton;


    private ButtonGroup osButtonGroup;


    private static final String LINUX_ICON_PATH = "/images/icons8-linux-100.png";
    private static final String WINDOWS_ICON_PATH = "/images/icons8-windows-os-100.png";
    private static final String MACINTOSH_ICON_PATH = "/images/icons8-apple-inc-100.png";
    private JPanel panel1;
    private JButton button1;


    public SwingRadioButtonDemo() {
        setTitle("Swing JRadioButton Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);


        setContentPane(mainPanel);


        osButtonGroup = new ButtonGroup();
        osButtonGroup.add(linuxRadioButton);
        osButtonGroup.add(windowsRadioButton);
        osButtonGroup.add(macintoshRadioButton);


        linuxRadioButton.setSelected(true);
        updateImage();


        ActionListener radioListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage();
            }
        };

        linuxRadioButton.addActionListener(radioListener);
        windowsRadioButton.addActionListener(radioListener);
        macintoshRadioButton.addActionListener(radioListener);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSelectionMessage();
            }
        });
    }

    private void updateImage() {
        ImageIcon icon = null;
        if (linuxRadioButton.isSelected()) {
            icon = loadImageIcon(LINUX_ICON_PATH);
        } else if (windowsRadioButton.isSelected()) {
            icon = loadImageIcon(WINDOWS_ICON_PATH);
        } else if (macintoshRadioButton.isSelected()) {
            icon = loadImageIcon(MACINTOSH_ICON_PATH);
        }

        if (icon != null) {
            int labelWidth = imageLabel.getPreferredSize().width;
            int labelHeight = imageLabel.getPreferredSize().height;

            if (labelWidth <= 0 || labelHeight <= 0) {
                labelWidth = 150;
                labelHeight = 150;
            }

            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("Brak obrazka");
        }
    }

    private ImageIcon loadImageIcon(String path) {
        URL imageUrl = getClass().getResource(path);
        if (imageUrl != null) {
            return new ImageIcon(imageUrl);
        } else {
            System.err.println("Nie znaleziono obrazka: " + path);
            return null;
        }
    }

    private void showSelectionMessage() {
        String selectedOS = "";
        if (linuxRadioButton.isSelected()) {
            selectedOS = "Linux";
        } else if (windowsRadioButton.isSelected()) {
            selectedOS = "Windows";
        } else if (macintoshRadioButton.isSelected()) {
            selectedOS = "Macintosh";
        }

        JOptionPane.showMessageDialog(this,
                "You selected: " + selectedOS,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}