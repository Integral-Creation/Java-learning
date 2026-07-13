import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("MyFrame");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Image And Background
        ImageIcon image = new ImageIcon("14_GUIBasics/src/chess-knight-solid.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(36,36,35)); // change color of background

        this.setVisible(true);
    }
}
