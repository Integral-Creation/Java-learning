/*
Common Features of Swing GUI Components
    GUI component inherit common behavior from JComponent Class, because of this, most of the Swing Component Share a common set of features.
    • The Component Class is the root for the all the GUI component and Containers.
    • All Swing GUI component (Except JFrame, JApplet, JDialog) are subclass of JComponent.

Frequently used Method in Component, Container, JComponent
    +---------------------------------------------------------------+
    |                    java.awt.Component                         |
    +---------------------------------------------------------------+
    | - font : java.awt.Font                                        | 
    | - background : java.awt.Color                                 |
    | - foreground : java.awt.Color                                 |
    | - preferredSize : java.awt.Dimension                          |
    | - cursor : java.awt.Cursor                                    |
    | - visible : boolean                                           |
    +---------------------------------------------------------------+
    | + getWidth() : int                                            |
    | + getHeight() : int                                           |
    | + getX() : int                                                |
    | + getY() : int                                                |
    +---------------------------------------------------------------+
                                ^
                                |
    +------------------------------------------------------+
    |                java.awt.Container                    |
    +------------------------------------------------------+
    | + add(comp: Component): Component                    |
    | + add(comp: Component, index: int): Component        |
    | + remove(comp: Component): void                      |
    | + getLayout(): LayoutManager                         |
    | + setLayout(l: LayoutManager): void                  |
    +------------------------------------------------------+
                                ^
                                |
    +------------------------------------------------------+
    |              javax.swing.JComponent                  |
    +------------------------------------------------------+
    | - toolTipText : String                               |
    | - border : javax.swing.border.Border                 |
    +------------------------------------------------------+

*/
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class TestSwingComponentFeatures extends JFrame {
    public TestSwingComponentFeatures(){

        // Create a Panel to Group Three Button
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2 ,2));

        JButton jbtLEFT = new JButton("LEFT");
        JButton jbtCENTER = new JButton("CENTER");
        JButton jbtRIGHT = new JButton("RIGHT");

        // Set Background and Foreground 
        jbtLEFT.setBackground(Color.WHITE);
        jbtCENTER.setForeground(Color.GREEN);
        jbtRIGHT.setToolTipText("This is the Right Button");

        p1.add(jbtLEFT);
        p1.add(jbtCENTER);
        p1.add(jbtRIGHT);

        p1.setBorder(new TitledBorder("Three Buttons"));
        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        // Create a font and a line border
        Font largerFont = new Font("TimesRoman", Font.BOLD, 20);
        Border linBorder = new LineBorder(Color.BLACK,2);

        // Create a Panel to group two labels
        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));

        JLabel jlbRed = new JLabel("Red");
        JLabel jlbOrange = new JLabel("Orange");

        jlbRed.setForeground(Color.RED);
        jlbOrange.setForeground(Color.ORANGE);
        jlbRed.setFont(largerFont);
        jlbOrange.setFont(largerFont);

        jlbRed.setBorder(linBorder);
        jlbOrange.setBorder(linBorder);

        p2.add(jlbRed);
        p2.add(jlbOrange);

        p2.setBorder(new TitledBorder("Two Labels"));

        // Add two Panels to the Frame
        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);
    }
}

public class _01CommonFeaturesOfSwingGUI {
    public static void main(String[] args) {
        // Create a Frame and set Its properties
        JFrame frame = new TestSwingComponentFeatures();
        frame.setTitle("TestSwingComponents");
        frame.setSize(300,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
