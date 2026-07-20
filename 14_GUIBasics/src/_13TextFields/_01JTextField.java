/*
    JTextField
        JTextField is a swing component used to accept single line text input from the user.
        It belong to javax.swing package
    
    • Declaration
        import javax.swing.JTextField;

    • Syntax:
        JTextField textField = new JTextField();

                   javax.swing.text.JTextComponent
                                ▲
                                │
        +------------------------------------------------------+
        |              javax.swing.JTextField                  |
        +------------------------------------------------------+
        | - columns : int                                      |
        | - horizontalAlignment : int                          |
        | - text : String                                      |
        | - editable : boolean                                 |
        +------------------------------------------------------+
        | + JTextField()                                       |
        | + JTextField(columns: int)                           |
        | + JTextField(text: String)                           |
        | + JTextField(text: String, columns: int)             |
        +------------------------------------------------------+
*/

import javax.swing.JFrame;
import javax.swing.JTextField;

public class _01JTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("showJTextField");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JTextField tf = new JTextField(20);
        frame.add(tf);
        
        frame.setVisible(true);
    }
}
