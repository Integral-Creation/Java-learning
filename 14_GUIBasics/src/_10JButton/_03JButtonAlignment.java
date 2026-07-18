/*
JButton Alignment
    • Method for Alignment 
        button.setHorizontalAlignment(JButton.LEFT);
        button.setVerticalAlignment(JButton.TOP);

    • Constant used
        Horizontal Alignment
            | Constant                  | Description           |
            | ------------------------- | --------------------- |
            | `SwingConstants.LEFT`     | Text on the left      |
            | `SwingConstants.CENTER`   | Text in the center    |
            | `SwingConstants.RIGHT`    | Text on the right     |
            | `SwingConstants.LEADING`  | Beginning of the line |
            | `SwingConstants.TRAILING` | End of the line       |

        Vertical Alignment
            | Constant                | Description |
            | ----------------------- | ----------- |
            | `SwingConstants.TOP`    | Top         |
            | `SwingConstants.CENTER` | Center      |
            | `SwingConstants.BOTTOM` | Bottom      |

*/

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class TestButtonAlignment extends JFrame{
    public TestButtonAlignment(){
        ImageIcon add2Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (1).gif");
        ImageIcon add3Icon = new ImageIcon("14_GUIBasics/src/icons8-add-button (2).gif");

        JButton jbt = new JButton("Click it!",add2Icon); // create regular icon
        jbt.setPressedIcon(add2Icon); // pressed icon
        jbt.setRolloverIcon(add3Icon); // rollover icon

        jbt.setFocusable(false);
        jbt.setBackground(Color.WHITE);

        // Horizontal Alignment
        jbt.setHorizontalAlignment(JButton.LEFT);
        // jbt.setHorizontalAlignment(JButton.CENTER);
        // jbt.setHorizontalAlignment(JButton.RIGHT);
        // jbt.setHorizontalAlignment(JButton.LEADING);
        // jbt.setHorizontalAlignment(JButton.TRAILING);

        // Vertical Alignment
        jbt.setVerticalAlignment(JButton.TOP);
        // jbt.setVerticalAlignment(JButton.CENTER);
        // jbt.setVerticalAlignment(JButton.BOTTOM);

        jbt.setBounds(250, 150, 250, 120);
        this.setLayout(null);
        this.add(jbt);
    }
}

public class _03JButtonAlignment {
    public static void main(String[] args) {
        JFrame frame = new TestButtonAlignment();
        frame.setTitle("TestButtonAlignment");
        frame.setLocationRelativeTo(null);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
