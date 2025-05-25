import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Uruchomienie GUI w wątku Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Tworzymy instancję naszego okna Swing
                SwingRadioButtonDemo frame = new SwingRadioButtonDemo();
                // Ustawiamy je jako widoczne
                frame.setVisible(true);
            }
        });
    }
}