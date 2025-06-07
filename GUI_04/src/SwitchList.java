import javax.swing.*;

public class SwitchList {
    private JPanel mainPanel;
    private JList<String> listLeft;
    private JList<String> listRight;
    private JButton buttonRight;
    private JButton buttonRightAll;
    private JButton buttonLeft;
    private JButton buttonLeftAll;

    private DefaultListModel<String> leftListModel;
    private DefaultListModel<String> rightListModel;

    public SwitchList() {
        initializeModels();
        setupButtons();
        setupListSelectionListeners();
        updateButtonStates();
    }

    private void initializeModels() {
        leftListModel = new DefaultListModel<>();
        rightListModel = new DefaultListModel<>();

        String[] initialData = {"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};
        for (String item : initialData) {
            leftListModel.addElement(item);
        }

        listLeft.setModel(leftListModel);
        listRight.setModel(rightListModel);
        listLeft.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listRight.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void setupButtons() {
        buttonRight.addActionListener(e -> moveSelectedItem(listLeft, leftListModel, rightListModel));
        buttonRightAll.addActionListener(e -> moveAllItems(leftListModel, rightListModel));
        buttonLeft.addActionListener(e -> moveSelectedItem(listRight, rightListModel, leftListModel));
        buttonLeftAll.addActionListener(e -> moveAllItems(rightListModel, leftListModel));
    }

    private void setupListSelectionListeners() {
        listLeft.addListSelectionListener(e -> updateButtonStates());
        listRight.addListSelectionListener(e -> updateButtonStates());
    }

    private void moveSelectedItem(JList<String> sourceList, DefaultListModel<String> sourceModel, DefaultListModel<String> targetModel) {
        int selectedIndex = sourceList.getSelectedIndex();
        if (selectedIndex != -1) {
            String selectedItem = sourceModel.getElementAt(selectedIndex);
            sourceModel.remove(selectedIndex);
            targetModel.addElement(selectedItem);

            if (targetModel == leftListModel) {
                listLeft.setSelectedIndex(targetModel.size() - 1);
            } else {
                listRight.setSelectedIndex(targetModel.size() - 1);
            }
        }
    }

    private void moveAllItems(DefaultListModel<String> sourceModel, DefaultListModel<String> targetModel) {
        while (!sourceModel.isEmpty()) {
            targetModel.addElement(sourceModel.getElementAt(0));
            sourceModel.remove(0);
        }
    }

    private void updateButtonStates() {
        buttonRight.setEnabled(listLeft.getSelectedIndex() != -1);
        buttonRightAll.setEnabled(!leftListModel.isEmpty());
        buttonLeft.setEnabled(listRight.getSelectedIndex() != -1);
        buttonLeftAll.setEnabled(!rightListModel.isEmpty());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}