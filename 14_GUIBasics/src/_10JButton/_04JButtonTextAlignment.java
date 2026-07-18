/*
    Text Alignment inside the JButton
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);        
*/

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class TestButtonTextAlignment extends JFrame{
    public TestButtonTextAlignment(){
        ImageIcon add2Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (1).gif");
        ImageIcon add3Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (2).gif");

        JButton jbt = new JButton("Click it!",add2Icon); // create regular icon
        jbt.setPressedIcon(add2Icon); // pressed icon
        jbt.setRolloverIcon(add3Icon); // rollover icon

        jbt.setFocusable(false);
        jbt.setBackground(Color.WHITE);

        // Horizontal Alignment
        jbt.setHorizontalTextPosition(JButton.LEFT);
        // jbt.setHorizontalTextPosition(JButton.RIGHT);
        // jbt.setHorizontalTextPosition(JButton.CENTER);
        
        // Vertical Alignment
        jbt.setVerticalTextPosition(JButton.CENTER);
        // jbt.setVerticalTextPosition(JButton.TOP);
        // jbt.setVerticalTextPosition(JButton.BOTTOM);
        

        jbt.setBounds(250, 150, 250, 120);
        this.setLayout(null);
        this.add(jbt);
    }
}

public class _04JButtonTextAlignment {
    public static void main(String[] args) {
        JFrame frame = new TestButtonTextAlignment();
        frame.setTitle("TestButtonAlignment");
        frame.setLocationRelativeTo(null);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
