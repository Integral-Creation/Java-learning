/*
    BorderLayout
        The BorderLayout manager divides the a container into five areas: East, West, South, North and Center.
        Components are added to a BorderLayout by using:
            syntax:
                add(Component, index)
                    where index is a constant
                        • BorderLayout.EAST
                        • BorderLayout.WEST
                        • BorderLayout.NORTH
                        • BorderLayout.SOUTH
                        • BorderLayout.CENTER

            BorderLayout:
                +----------------------+
                |       NORTH          |
                +----+------------+----+
                |WEST|   CENTER   |EAST|
                +----+------------+----+
                |       SOUTH          |
                +----------------------+


    |               java.awt.BorderLayout                  |
    +------------------------------------------------------+
    | - hgap : int                                         | The hgap between component (default: 0)
    | - vgap : int                                         | The vgap between component (default: 0)
    +------------------------------------------------------+
    | + BorderLayout()                                     | Create a default BorderLayout Manager
    | + BorderLayout(hgap: int, vgap: int)                 |  Create a BorderLayout with specified number of rows and columns.
*/

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class ShowBorderLayout extends JFrame{
    public ShowBorderLayout(){
        // Set BorderLayout with horizontal gap 5, vertical gap 10
        setLayout(new BorderLayout(5,10));

        // Add buttons to the Frame
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("CENTER"), BorderLayout.CENTER);
    }
}
public class _04BorderLayout {
    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();

        frame.setTitle("ShowBorderLayout");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
