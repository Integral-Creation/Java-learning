/*
    JLabel
        It is a swing component used to display the non-editable text, image or both in a GUI.
        It is mainly used to provide the information or label for other component such as text field, button, or checkbox.

    • Declaration
        import javax.swing.JLabel;
*/

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class _01label {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("14_GUIBasics/src/chess-knight-solid.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        label.setText("Welcome To Java"); // set text of label
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(Color.GRAY);
        label.setFont(new Font("Calisto MT", Font.BOLD, 50)); // set font text 
        label.setIconTextGap(-20);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true); // display Background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setBounds(100,100,800,600); // set x, y position within the frame as well as dimension


        JFrame frame = new JFrame();
        frame.setTitle("MyFrame");
        frame.setLocationRelativeTo(null);
        // frame.setSize(900, 700);
        // frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.add(label);
        frame.setVisible(true);
        frame.pack();
    }
}