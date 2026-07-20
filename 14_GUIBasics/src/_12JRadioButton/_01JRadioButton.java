/*
    JRadioButton
       A JRadioButton is a Swing component that allows user to select the from option of mutually exclusive option.
       
    • Syntax:
        JRadioButton rb = new JRadioButton("Option");

                javax.swing.AbstractButton
                            ▲
                            │
                javax.swing.JToggleButton
                            ▲
                            │
+---------------------------------------------------------------+
|             javax.swing.JRadioButton                          |
+---------------------------------------------------------------+
| + JRadioButton()                                              |
| + JRadioButton(text: String)                                  |
| + JRadioButton(text: String, selected: boolean)               |
| + JRadioButton(icon: Icon)                                    |
| + JRadioButton(text: String, icon: Icon)                      |
| + JRadioButton(text: String, icon: Icon, selected: boolean)   |
+---------------------------------------------------------------+
*/

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class _01JRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("ShowRadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Select Your Gender:");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();

        
        group.add(male);
        group.add(female);

        label.setBounds(50,30,150,30);
        male.setBounds(50, 50, 100, 30);
        female.setBounds(50, 70, 100, 30);

        frame.add(label);
        frame.add(male);
        frame.add(female);

        frame.setVisible(true);
    }
}
