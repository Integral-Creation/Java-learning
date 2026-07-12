/*
    Adding component to Frame
        We can add component to a frame using the add method.
*/

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02addingComponentToFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MyFrame");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add a button to the frame
        JButton jbtOK = new JButton();
        frame.add(jbtOK);
    }
}
