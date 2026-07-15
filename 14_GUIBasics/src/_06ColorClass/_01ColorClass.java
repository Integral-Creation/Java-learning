/*
    Color Class
        The color class in java represent color and its part of the java.awt package.

        • Declaration
            java.awt.Color
*/

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01ColorClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("ShowColor");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        JButton jbtOK = new JButton("OK");
        jbtOK.setBackground(Color.WHITE);
        jbtOK.setForeground(Color.GRAY);
        frame.add(jbtOK);

        
        frame.setVisible(true);
    }
}
