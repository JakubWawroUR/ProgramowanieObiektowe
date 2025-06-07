import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorEditor {
    private JPanel mainPanel;
    private JComboBox<String> comboBox1;
    private JTextPane textPane1;
    private JButton bButton;
    private JButton iButton;
    private JButton zButton;
    private JButton pButton;

    private final Map<String, Color> colorMap = new HashMap<>();
    private int currentFontSize = 12;

    public ColorEditor() {
        initializeColorMap();
        setupDefaults();
        setupEventListeners();
    }

    private void initializeColorMap() {
        colorMap.put("Czerwony", Color.RED);
        colorMap.put("Czarny", Color.BLACK);
        colorMap.put("Zielony", Color.GREEN);
        colorMap.put("Niebieski", Color.BLUE);
        colorMap.put("Zolty", Color.YELLOW);
        colorMap.put("Szary", Color.GRAY);
        colorMap.put("Fioletowy", new Color(128, 0, 128));
    }

    private void setupDefaults() {
        textPane1.setBackground(Color.LIGHT_GRAY);
        textPane1.setForeground(Color.BLACK);
        comboBox1.setSelectedItem("Czarny");
    }

    private void setupEventListeners() {
        comboBox1.addActionListener(e -> changeTextColor());
        bButton.addActionListener(e -> toggleFontStyle(Font.BOLD));
        iButton.addActionListener(e -> toggleFontStyle(Font.ITALIC));
        zButton.addActionListener(e -> changeFontSize(-1));
        pButton.addActionListener(e -> changeFontSize(1));
    }

    private void changeTextColor() {
        String selectedColor = (String) comboBox1.getSelectedItem();
        if (selectedColor != null && colorMap.containsKey(selectedColor)) {
            textPane1.setForeground(colorMap.get(selectedColor));
        }
    }

    private void toggleFontStyle(int style) {
        StyledDocument doc = textPane1.getStyledDocument();
        int start = textPane1.getSelectionStart();
        int end = textPane1.getSelectionEnd();

        if (start == end) {
            start = 0;
            end = doc.getLength();
        }

        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet as = sc.addAttribute(SimpleAttributeSet.EMPTY,
                (style == Font.BOLD) ? StyleConstants.CharacterConstants.Bold :
                        StyleConstants.CharacterConstants.Italic,
                !isStyleActive(doc, start, style));

        doc.setCharacterAttributes(start, end - start, as, false);
    }

    private boolean isStyleActive(StyledDocument doc, int pos, int style) {
        AttributeSet attrs = doc.getCharacterElement(pos).getAttributes();
        return (style == Font.BOLD) ? StyleConstants.isBold(attrs) : StyleConstants.isItalic(attrs);
    }

    private void changeFontSize(int delta) {
        currentFontSize = Math.max(1, currentFontSize + delta);

        StyledDocument doc = textPane1.getStyledDocument();
        int start = textPane1.getSelectionStart();
        int end = textPane1.getSelectionEnd();

        if (start == end) {
            start = 0;
            end = doc.getLength();
        }

        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet as = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.FontSize, currentFontSize);
        doc.setCharacterAttributes(start, end - start, as, false);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}