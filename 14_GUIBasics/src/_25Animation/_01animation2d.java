import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myPanelAnimation extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 450;
    Image chen;
    Image BackgroundImage;

    Timer timer;

    int xVelocity = 1;
    int yVelocity = 2;

    int x = 0;
    int y = 0;


    public myPanelAnimation(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        chen = new ImageIcon("14_GUIBasics/src/chen.png").getImage();
        BackgroundImage = new ImageIcon("14_GUIBasics/src/Background.png").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g); // it paint background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(BackgroundImage,0,0,null);
        g2D.drawImage(chen,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - chen.getWidth(null) || x < 0){
            xVelocity = xVelocity * (-1);
        }
        x = x + xVelocity;

        if(y >= PANEL_HEIGHT - chen.getHeight(null) || y < 0){
            yVelocity = yVelocity * (-1);
        }
        y = y + yVelocity;
        repaint();
    }
        
}

class myAnimation extends JFrame{

    myPanelAnimation panel;

    public myAnimation(){
        panel = new myPanelAnimation();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class _01animation2d {
    public static void main(String[] args) {
        new myAnimation();
    }
}
