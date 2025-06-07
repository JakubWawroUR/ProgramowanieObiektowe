import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {
    private JPanel mainPanel;
    private JList<String> list1;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField dateField;
    private JLabel ageLabel;
    private JButton saveNewButton;
    private JButton saveExistingButton;

    private List<Person> people = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();

    public PersonApp() {
        list1.setModel(listModel);

        list1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && list1.getSelectedIndex() != -1) {
                int selectedIndex = list1.getSelectedIndex();
                Person selectedPerson = people.get(selectedIndex);
                updateFields(selectedPerson);
                saveExistingButton.setEnabled(true);
            }
        });

        saveNewButton.addActionListener(e -> saveNewPerson());

        saveExistingButton.addActionListener(e -> saveExistingPerson());
    }

    private void updateFields(Person person) {
        nameField.setText(person.getName());
        emailField.setText(person.getEmail());
        phoneField.setText(person.getPhone());
        addressField.setText(person.getAddress());
        dateField.setText(person.getBirthDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        ageLabel.setText(calculateAge(person.getBirthDate()) + " years");
    }

    private void saveNewPerson() {
        try {
            if (nameField.getText().isEmpty() || emailField.getText().isEmpty() ||
                    phoneField.getText().isEmpty() || addressField.getText().isEmpty() ||
                    dateField.getText().isEmpty()) {
                showError("Wszystkie pola musza byc wypelnione!");
                return;
            }

            String dateText = dateField.getText();
            if (!dateText.matches("\\d{4}-\\d{2}-\\d{2}")) {
                showError("Format daty: yyyy-MM-dd");
                return;
            }

            LocalDate birthDate = LocalDate.parse(dateText, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            if (birthDate.isAfter(LocalDate.now())) {
                showError("Za daleka data!");
                return;
            }

            Person newPerson = new Person(
                    nameField.getText(),
                    emailField.getText(),
                    phoneField.getText(),
                    addressField.getText(),
                    birthDate
            );
            people.add(newPerson);
            listModel.addElement(newPerson.getName());
            clearFields();
            saveExistingButton.setEnabled(false);
        } catch (Exception ex) {
            showError("Blad danych: " + ex.getMessage());
        }
    }

    private void saveExistingPerson() {
        int selectedIndex = list1.getSelectedIndex();
        if (selectedIndex != -1) {
            try {
                if (nameField.getText().isEmpty() || emailField.getText().isEmpty() ||
                        phoneField.getText().isEmpty() || addressField.getText().isEmpty() ||
                        dateField.getText().isEmpty()) {
                    showError("Wszystkie pola musza byc pelne!");
                    return;
                }

                String dateText = dateField.getText();
                if (!dateText.matches("\\d{4}-\\d{2}-\\d{2}")) {
                    showError("Format daty: yyyy-MM-dd");
                    return;
                }

                LocalDate birthDate = LocalDate.parse(dateText, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                if (birthDate.isAfter(LocalDate.now())) {
                    showError("Za daleka data!");
                    return;
                }

                Person person = people.get(selectedIndex);
                person.setName(nameField.getText());
                person.setEmail(emailField.getText());
                person.setPhone(phoneField.getText());
                person.setAddress(addressField.getText());
                person.setBirthDate(birthDate);

                listModel.set(selectedIndex, person.getName());
                ageLabel.setText(calculateAge(person.getBirthDate()) + " years");
            } catch (Exception ex) {
                showError("Blad: " + ex.getMessage());
            }
        }
    }

    private int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressField.setText("");
        dateField.setText("");
        ageLabel.setText("0 years");
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(mainPanel, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}