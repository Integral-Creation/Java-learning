/*
    Key Binding is a swing features that maps the keyStrokes to an Action.

    Common KeyStrokes 
        • Single
            "W"
            "A"
            "S"
            "D"
        • Arrow Key
            "UP"
            "DOWN"
            "LEFT"
            "RIGHT"
        • Modifier
            "shift W"
            "ctrl S"
            "alt X"
            "ctrl shift N"
    
    KeyBinding is commonly used in
        • Player movement in games
        • Keyboard shortcut
        • Menu accelerator
        • Text editor shortcut
*/

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class myKeyBinding extends JFrame{

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    myKeyBinding(){
        
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() + 10);
        }

    }
    public class LeftAction extends AbstractAction{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10,label.getY());
        }
        
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10,label.getY());
        }

    }
}

public class _01KeyBindings {
    public static void main(String[] args) {
        myKeyBinding demo = new myKeyBinding();
        demo.setLocationRelativeTo(null);
    }
}
