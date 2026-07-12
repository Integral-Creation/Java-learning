/*
    JFrame
        It is a GUI Window to add components to.
    
    • Creating a Frame use the following JFrame class

        +------------------------------------------------------+
        |                 javax.swing.JFrame                   |
        +------------------------------------------------------+
        | + JFrame()                                           |
        | + JFrame(title: String)                              |
        | + setTitle(title: String)                            | 
        | + setSize(width: int, height: int): void             |
        | + setLocation(x: int, y: int): void                  |
        | + setVisible(visible: boolean): void                 |
        | + setResizable(resizable: Boolean)                   |
        | + setDefaultCloseOperation(mode: int): void          |
        | + setLocationRelativeTo(c: Component): void          |
        | + pack(): void                                       |
        +------------------------------------------------------+
*/

import javax.swing.JFrame;

public class _01createFrame {
    public static void main(String[] args) {
        /*Creating a Frame */
        JFrame frame = new JFrame();

        frame.setTitle("MyJFrame"); // sets title of frame
        frame.setSize(400,300); // sets the x-dimension and y-dimension of frame
        frame.setLocationRelativeTo(null); // center the frame
        frame.setResizable(false); // prevent frame from resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setVisible(true); // makes frame visible
    }
}
