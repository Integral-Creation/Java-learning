/*
    KeyListener
        A keyListener is an interface in the java.awt.event package that is used to detect the keyboard events.

    • Import
        import java.awt.event.KeyListener;
        
    • Method of keyListener
        | Method                    | Description                                             |
        | ------------------------- | ------------------------------------------------------- |
        | `keyPressed(KeyEvent e)`  | Called when a key is pressed down.                      |
        | `keyReleased(KeyEvent e)` | Called when a pressed key is released.                  |
        | `keyTyped(KeyEvent e)`    | Called when a character key is typed (press + release). |

    • KeyEvent methods
        | Method            | Purpose                                                 |
        | ----------------- | ------------------------------------------------------- |
        | `getKeyCode()`    | Returns the virtual key code (e.g., `VK_W`, `VK_LEFT`). |
        | `getKeyChar()`    | Returns the character typed (e.g., `'a'`).              |
        | `isShiftDown()`   | Checks if Shift is held.                                |
        | `isControlDown()` | Checks if Ctrl is held.                                 |
        | `isAltDown()`     | Checks if Alt is held.                                  |

*/

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class myJKeyListener extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;

    public myJKeyListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);

        icon = new ImageIcon("14_GUIBasics/src/icons8-rocket-66.png");
        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        // label.setBackground(Color.DARK_GRAY);
        // label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(),label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10,label.getY());
                break;
            
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY() - 10);
                break;
            case 39: label.setLocation(label.getX() + 10,label.getY());
                break;
            case 40: label.setLocation(label.getX(),label.getY() + 10);
                break;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}

public class _01JKeyListener {
    public static void main(String[] args) {
        JFrame frame = new myJKeyListener();
        frame.setLocationRelativeTo(null);
    }
}
