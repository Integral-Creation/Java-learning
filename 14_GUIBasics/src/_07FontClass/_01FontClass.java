/*
    Font Class
        The Font class in java represent the font used to display text. Its belongs to the java.awt package and it is commonly used in Swing and awt application to change the appearance of the text.

    • Declaration
        java.awt.Font

    • Font style
        | Constant                  | Description     |
        | ------------------------- | --------------- |
        | `Font.PLAIN`              | Normal text     |
        | `Font.BOLD`               | Bold text       |
        | `Font.ITALIC`             | Italic text     |
        | `Font.BOLD + Font.ITALIC` | Bold and Italic |
    • Common Method
        | Method                   | Description                                |
        | ------------------------ | ------------------------------------------ |
        | `getFamily()`            | Returns the font family.                   |
        | `getName()`              | Returns the font name.                     |
        | `getSize()`              | Returns the font size.                     |
        | `getStyle()`             | Returns the font style.                    |
        | `deriveFont(float size)` | Creates a new font with a different size.  |
        | `deriveFont(int style)`  | Creates a new font with a different style. |
        | `isBold()`               | Returns `true` if the font is bold.        |
        | `isItalic()`             | Returns `true` if the font is italic.      |


*/
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01FontClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame();


        frame.setTitle("ShowColor");
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());
        
        Font font1 = new Font("SensSerif", Font.BOLD, 16);
        Font font2 = new Font("Serif", Font.BOLD + Font.ITALIC, 16);

        JButton jbtOK1 = new JButton("OK");
        JButton jbtOK2 = new JButton("OK");

        jbtOK1.setFont(font1);
        frame.add(jbtOK1, BorderLayout.WEST);

        jbtOK2.setFont(font2);
        frame.add(jbtOK2, BorderLayout.EAST);


        frame.setVisible(true);
    }
}
