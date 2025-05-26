import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox {
    private JButton wsteczButton;
    private JButton okButton;
    private JButton wyjscieButton;
    private JCheckBox java200zlCheckBox;
    private JCheckBox c400zlCheckBox;
    private JCheckBox c300zlCheckBox;
    private JCheckBox python350zlCheckBox;


    public CheckBox() {
        okButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                float cena = 0;

                if(java200zlCheckBox.isSelected()){
                    cena+=200;
                    text+="Java ";
                }else if(c400zlCheckBox.isSelected()){
                    cena += 400;
                    text+= "C#";
                }else if(c300zlCheckBox.isSelected()){
                    cena += 300;
                    text+="C++";
                }else if(python350zlCheckBox.isSelected()){
                    cena += 350;
                    text +="Python";
                }
                text+="---------------------------------------------\n";
                JOptionPane.showMessageDialog(null,text+"Razem: " + cena + "PLN");
            }
        });
    }
}
