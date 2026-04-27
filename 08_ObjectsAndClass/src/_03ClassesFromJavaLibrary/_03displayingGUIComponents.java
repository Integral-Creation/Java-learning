package _03ClassesFromJavaLibrary;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class _03displayingGUIComponents {
    public static void main(String[] args) {
        // create a button with text OK
        JButton jbtOK = new JButton();

        // create a button with text cancel
        JButton jbtCancel = new JButton();

        // create a label with text "Enter your name: "
        JLabel jbtLabelName = new JLabel("Enter your name: ");

        // create a text filed with text "Type Name Here"
        JTextField jTextFieldName = new JTextField("Type your name: ");

        // create a check box with text Bold
        JCheckBox jCheckBoxBold = new JCheckBox("Bold");

        // create a check box with text Italic 
        JCheckBox jCheckBoxItalic = new JCheckBox("Italic");

        // create a radio button with text Red
        JRadioButton jRadioButtonRed = new JRadioButton("Red");

        // create a radio button with text Yellow
        JRadioButton jRadioButtonYellow = new JRadioButton("Yellow");

        // create a combo box with several choices
        JComboBox<String> jComboBoxColor = new JComboBox<>(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});


        // create a panal to group components
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        panel.add(jbtLabelName);
        panel.add(jTextFieldName);

        panel.add(jCheckBoxBold);
        panel.add(jCheckBoxItalic);

        panel.add(jRadioButtonRed);
        panel.add(jRadioButtonYellow);

        panel.add(jComboBoxColor);

        // create a JFrame
        JFrame frame = new JFrame();
        frame.add(panel); // add the panel to the frame
        frame.setTitle("Show GUI Components");
        frame.setSize(450,100);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
