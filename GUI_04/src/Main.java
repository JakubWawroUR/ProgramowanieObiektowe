import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz zadanie:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n) {
            case 1:
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Przenoszenie elementów między listami");
                    SwitchList switchList = new SwitchList();
                    frame.setContentPane(switchList.getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });
                break;
            case 2:
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Edytor Tekstu");
                    ColorEditor editor = new ColorEditor();
                    frame.setContentPane(editor.getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 400);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });
        }

    }
}