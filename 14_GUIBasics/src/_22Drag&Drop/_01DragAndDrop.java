import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class myJDragAndDrop extends JFrame {

    DragPanel dargPanel = new DragPanel();

    public myJDragAndDrop(){
        this.add(dargPanel);
        this.setTitle("Drag and Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
} 

class DragPanel extends JPanel{

    ImageIcon image = new ImageIcon("14_GUIBasics/src/icons8-unchecked-50.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    public DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(
                (int)(currentPt.getX() - prevPt.getX()), 
                (int)(currentPt.getY() - prevPt.getY())
            );

            prevPt = currentPt;
            repaint();
        }
    }
}

public class _01DragAndDrop {
    public static void main(String[] args) {
        JFrame frame = new myJDragAndDrop();
        frame.setLocationRelativeTo(null);
    }
}
