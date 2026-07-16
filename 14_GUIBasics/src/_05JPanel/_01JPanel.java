/*
    JPanel
        • In Swing JPanel is used as a subContainer.
        • Instead of placing every component in a JFrame we can group the related component together inside one or more JPanels. This makes the GUI easier to manage.

*/

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _01JPanel {
    public static void main(String[] args) {
        // Create Label
        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        
        // Create Panels
        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p1.setBounds(0,0,250,250);
        p1.setLayout(new BorderLayout());
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setBounds(250,0,250,250);
        p2.setLayout(new BorderLayout());
        
        
        JPanel p3 = new JPanel();
        p3.setBackground(Color.GREEN);
        p3.setBounds(0,250,500,250);
        p3.setLayout(new BorderLayout());
        

        JFrame frame = new JFrame();
        frame.setTitle("TestJPanel");
        frame.setSize(750,750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add Panel to the Frame
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        p1.add(label);
    }
}
