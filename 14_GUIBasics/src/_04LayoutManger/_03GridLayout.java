/*
    GridLayout
        • The GridLayout manager arranger components in a grid(matrix) Formation.
        • The component are placed in the grid from left to right

    |                    java.awt.GridLayout                     |
    +------------------------------------------------------------+
    | - rows : int                                               | The number of row in a grid (default: 1)
    | - columns : int                                            | The number of column in a grid (default: 1)
    | - hgap : int                                               | The hgap between component (default: 0)
    | - vgap : int                                               | The vgap between component (default: 0)
    +------------------------------------------------------------+
    | + GridLayout()                                             | Create a default GridLayout Manager
    | + GridLayout(rows: int, columns: int)                      | Create a GridLayout with specified number of rows and columns.
    | + GridLayout(rows: int, columns: int, hgap: int, vgap: int)| Create a GridLayout with specified number of rows and columns, hgap and vgap.

*/

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        // Set GridLayout, 3 rows, 2 Columns and gaps 5 between component horizontally and vertically.
        setLayout(new GridLayout(3,2,5,5));

        // Add labels and text fields to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
        add(new JLabel("Class"));
        add(new JTextField(1));
    }
}
public class _03GridLayout {
    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();

        frame.setTitle("ShowGridLayout");
        frame.setSize(400,125);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
