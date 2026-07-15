/*
    Font Class
        The Font class in java represent the font used to display text. Its belongs to the java.awt package and it is commonly used in Swing and awt application to change the appearance of the text.

    • Declaration
        java.awt.Font
*/
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01FontClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();


        frame.setTitle("ShowColor");
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());
        
        Font font1 = new Font("SensSerif", Font.BOLD, 16);
        Font font2 = new Font("Serif", Font.BOLD + Font.ITALIC, 16);

        JButton jbtOK1 = new JButton("OK");
        JButton jbtOK2 = new JButton("OK");

        jbtOK1.setFont(font1);
        frame.add(jbtOK1, BorderLayout.WEST);

        jbtOK2.setFont(font2);
        frame.add(jbtOK2, BorderLayout.EAST);


        frame.setVisible(true);
    }
}
