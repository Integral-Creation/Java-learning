/*
    ImageIcon
        The ImageIcon class belongs to the java.swing package used to load the image and display image in swing application.

        • Declaration
            import javax.swing.ImageIcon;

        • Load an Image
            ImageIcon image = new ImageIcon("<Image file path>");
*/

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TestImageIcon extends JFrame{
    private ImageIcon homeIcon = new ImageIcon("14_GUIBasics/src/home.gif");
    private ImageIcon profileIcon = new ImageIcon("14_GUIBasics/src/profile.gif");
    private ImageIcon settingIcon = new ImageIcon("14_GUIBasics/src/settings.gif");

    public TestImageIcon(){
        setLayout(new GridLayout(1,3,5,5));
        add(new JLabel(homeIcon));
        add(new JLabel(profileIcon));
        add(new JLabel(settingIcon));
    }
}

public class _01ImageIcon {
    public static void main(String[] args) {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
