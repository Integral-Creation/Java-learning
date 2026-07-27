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
