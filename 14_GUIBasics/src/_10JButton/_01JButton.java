import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyButton extends JFrame{

    JButton jbt;

    public MyButton(){
        ImageIcon icon = new ImageIcon("14_GUIBasics/src/hand-pointer.png");

        // Create Button and Some Properties
        jbt = new JButton();
        jbt.setBounds(150,100,250,100);
        jbt.setText("I am A Button");
        jbt.setFocusable(false);
        jbt.setIcon(icon);
        jbt.setHorizontalTextPosition(JButton.CENTER);
        jbt.setVerticalTextPosition(JButton.BOTTOM);
        jbt.setIconTextGap(-5);
        jbt.setForeground(Color.LIGHT_GRAY);
        jbt.setBackground(Color.GRAY);
        jbt.setBorder(BorderFactory.createEtchedBorder());
        jbt.addActionListener(e -> System.out.println("Button is Clicked"));

        this.setTitle("MyButton");
        this.setLocationRelativeTo(null);
        this.setSize(500,300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(jbt);

        this.setVisible(true);
    }
}

public class _01JButton {
    public static void main(String[] args) {
        new MyButton();
    }
}
