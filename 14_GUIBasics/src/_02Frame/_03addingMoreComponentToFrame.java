/*
It creates a JFrame, sets its size and position, changes the frame icon, and sets the background color.
*/

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class _03addingMoreComponentToFrame {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("MyFrame");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create an ImageIcon
        ImageIcon image = new ImageIcon("14_GUIBasics/src/chess-knight-solid.png");
        frame.setIconImage(image.getImage());
        
        // frame.getContentPane().setBackground(Color.DARK_GRAY); // change color of background
        frame.getContentPane().setBackground(new Color(36,36,35)); // change color of background

        frame.setVisible(true);
    }
}