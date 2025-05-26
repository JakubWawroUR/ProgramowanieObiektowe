import javax.swing.*;

public class ComboBox {
    private JButton okButton;
    private JButton backButton;
    private JComboBox<String> comboBox1;
    private JPanel rootPanel;

    public ComboBox() {
        comboBox1.addItem("Java");
        comboBox1.addItem("Python");
        comboBox1.addItem("C++");
        comboBox1.addItem("JavaScript");
        comboBox1.addItem("Ruby");
        comboBox1.addItem("Go");
        comboBox1.addItem("Kotlin");

        okButton.addActionListener(e -> {
            String selected = (String) comboBox1.getSelectedItem();
            JOptionPane.showMessageDialog(null, "Wybrany język: " + selected);
        });

        backButton.addActionListener(e -> {
            System.out.println("Naciśnięto przycisk Cofnij");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Przykład ComboBox");
        ComboBox comboBox = new ComboBox();
        frame.setContentPane(comboBox.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
