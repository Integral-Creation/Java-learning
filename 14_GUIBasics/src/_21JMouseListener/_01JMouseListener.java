/*
    Mouse Listener in Java is an interface from the java.awt.event package that lets you detect the mouse click event on a component such as the JFrame, JButton, JLabel etc.

    • Method of Mouse listener
        | Method                        | Description                                                   |
        | ----------------------------- | ------------------------------------------------------------- |
        | `mouseClicked(MouseEvent e)`  | Called when a mouse button is clicked (pressed and released). |
        | `mousePressed(MouseEvent e)`  | Called when a mouse button is pressed.                        |
        | `mouseReleased(MouseEvent e)` | Called when a pressed mouse button is released.               |
        | `mouseEntered(MouseEvent e)`  | Called when the mouse pointer enters a component.             |
        | `mouseExited(MouseEvent e)`   | Called when the mouse pointer leaves a component.             |

    • Useful event
        | Method            | Description                                     |
        | ----------------- | ----------------------------------------------- |
        | `getX()`          | Returns the X-coordinate of the mouse.          |
        | `getY()`          | Returns the Y-coordinate of the mouse.          |
        | `getPoint()`      | Returns the mouse position as a `Point` object. |
        | `getClickCount()` | Returns the number of clicks.                   |
        | `getButton()`     | Returns which mouse button was pressed.         |

*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class myJMouseListener extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon neutral;
    ImageIcon happy;
    ImageIcon confused;
    ImageIcon angry;
    ImageIcon blush;

    public myJMouseListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        neutral = new ImageIcon("14_GUIBasics/src/Neutral.png");
        happy = new ImageIcon("14_GUIBasics/src/Happy.png");
        confused = new ImageIcon("14_GUIBasics/src/Confused.png");
        angry = new ImageIcon("14_GUIBasics/src/Angry.png");
        blush = new ImageIcon("14_GUIBasics/src/Blush.png");

        label = new JLabel();
        // label.setBounds(0,0,100,100);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        label.setIcon(neutral);
        label.addMouseListener(this);

        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(angry);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(blush);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(confused);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(happy);
    }
}

public class _01JMouseListener {
    public static void main(String[] args) {
        JFrame frame = new myJMouseListener();
        frame.setLocationRelativeTo(null);
    }
}
