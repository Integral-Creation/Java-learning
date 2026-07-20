/*
    Layered Layout
        Layered Layout in the swing allows us to place the component at different depth level (layers) so that they can overlaps each other.
        It is implemented using the the JLayeredPane class.

        Unlike the other Layout Manager, it's doesn't automatically arranges itself. thus, we have to specifies each and every components positions using the setBound().

        • Predefined Common JLayeredPane layers
            +------------------------------------------------------+
            |           javax.swing.JLayeredPane                   |
            +------------------------------------------------------+
            | + DEFAULT_LAYER : Integer = 0                        |
            | + PALETTE_LAYER : Integer = 100                      |
            | + MODAL_LAYER : Integer = 200                        |
            | + POPUP_LAYER : Integer = 300                        |
            | + DRAG_LAYER : Integer = 400                         |
            +------------------------------------------------------+

        Syntax:
            JLayeredPane layeredPane = new JLayeredPane();
*/
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

class showLayeredLayout extends JFrame {
    public showLayeredLayout(){
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(450, 350));

        JLabel red = new JLabel();
        red.setOpaque(true);
        red.setBackground(Color.red);
        red.setBounds(50,50,150,150);

        JLabel green = new JLabel();
        green.setOpaque(true);
        green.setBackground(Color.green);
        green.setBounds(100,100,150,150);

        JLabel blue = new JLabel();
        blue.setOpaque(true);
        blue.setBackground(Color.blue);
        blue.setBounds(150,150,150,150);

        // layeredPane.add(red, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(red, Integer.valueOf(0));
        // layeredPane.add(green, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(green, Integer.valueOf(2));
        // layeredPane.add(blue, JLayeredPane.DRAG_LAYER);
        layeredPane.add(blue, Integer.valueOf(1));

        this.add(layeredPane);
    }
}
public class _05LayeredLayout {
    public static void main(String[] args) {
        JFrame frame = new showLayeredLayout();
        frame.setTitle("ShowLayeredLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
