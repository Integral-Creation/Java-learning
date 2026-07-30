import java.awt.*;
import javax.swing.*;

class myPanel extends JPanel{

    Image image;

    public myPanel(){
        image = new ImageIcon("14_GUIBasics/src/icons8-unchecked-50.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.gray); // set the color

    /** Draw Line */
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,500,500);

    /** Draw Rectangle */
        g2D.drawRect(0, 0, 100, 800);
        g2D.fillRect(0,0,100,80);

    /** Draw Oval */
        g2D.drawOval(0, 0, 100, 70);
        g2D.fillOval(0, 0, 100, 70);

    /** Draw Arc */
        g2D.setPaint(Color.red);
        g2D.fillArc(0, 0, 100, 100, 0, 180);

    /** Draw PokeBall */
        g2D.setPaint(Color.lightGray);
        g2D.fillArc(0, 0, 100, 100, 180, 180);

        
    /** Draw Triangle */
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.red);
        // g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);

    /** Draw String */
        g2D.setPaint(Color.CYAN);
        g2D.setFont(new Font("Ink Free", Font.BOLD,50));
        g2D.drawString("Wa-ka Wa-ka Wa-ka", 50, 50);

    /** DrawImage */
        g2D.drawImage(image, 0,0, null);

    }
}

class myGraphics extends JFrame {

    myPanel panel;

    public myGraphics(){
        panel = new myPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);

        this.add(panel);
        
        this.pack();
        this.setVisible(true);
    }
}

public class _01graphics {
    public static void main(String[] args) {
        new myGraphics();
    }
}
