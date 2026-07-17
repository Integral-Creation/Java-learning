import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class TestButtonIcons extends JFrame{
    public TestButtonIcons(){
        ImageIcon add2Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (1).gif");
        ImageIcon add3Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (2).gif");

        JButton jbt = new JButton("Click it!",add2Icon); // create regular icon
        jbt.setPressedIcon(add2Icon); // pressed icon
        jbt.setRolloverIcon(add3Icon); // rollover icon

        jbt.setFocusable(false);
        jbt.setBackground(Color.WHITE);

        add(jbt); // add a button
    }
}

public class _02JButtonIcons {
    public static void main(String[] args) {
        JFrame frame = new TestButtonIcons();
        frame.setTitle("TestButtonIcons");
        frame.setLocationRelativeTo(null);
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
