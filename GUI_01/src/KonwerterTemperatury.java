import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonwerterTemperatury extends JFrame {

    private JTextField poleTekstoweCelsjusz;
    private JButton przekonwertujButton;
    private JLabel temp;

    public KonwerterTemperatury() {
        super("Konwerter Temperatury (C na F)");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);

        JPanel panelGlowny = new JPanel();
        panelGlowny.setLayout(new GridLayout(3, 2, 10, 10));
        panelGlowny.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel etykietaWejscia = new JLabel("Temperatura w stopniach Celsjusza:");

        poleTekstoweCelsjusz = new JTextField(10);

        przekonwertujButton = new JButton("Przekonwertuj");

        temp = new JLabel("Wynik: ");
        temp.setFont(new Font("Arial", Font.BOLD, 16));

        panelGlowny.add(etykietaWejscia);
        panelGlowny.add(poleTekstoweCelsjusz);
        panelGlowny.add(przekonwertujButton);
        panelGlowny.add(new JLabel());
        panelGlowny.add(temp);

        przekonwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                konwertujTemperature();
            }
        });

        add(panelGlowny);
    }

    private void konwertujTemperature() {
        try {
            String tekstCelsjusz = poleTekstoweCelsjusz.getText();

            double celsjusz = Double.parseDouble(tekstCelsjusz);

            double fahrenheit = (celsjusz * 9.0 / 5) + 32;

            temp.setText(String.format("Wynik: %.2f Fahrenheit", fahrenheit));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Proszę wprowadzić prawidłową liczbę dla temperatury Celsjusza.",
                    "Błąd Wprowadzania",
                    JOptionPane.ERROR_MESSAGE);
            temp.setText("Wynik: Błąd");
        }
    }
}
