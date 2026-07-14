/*
    FlowLayout
        • Default Layout for JPanel
        • Component are placed from left to right
        • Moves the components to the next line if insufficient space

    |                java.awt.FlowLayout                   |
    +------------------------------------------------------+
    | - alignment : int                                    | the alignment of this layout manager (default: CENTER)
    | - hgap : int                                         | The Horizontal gap between the component
    | - vgap : int                                         | The Vertical gap between the component
    +------------------------------------------------------+
    | + FlowLayout()                                       | Creates a Default FlowLayout Manager
    | + FlowLayout(alignment: int)                         | Creates a FlowLayout manager with specified alignment
    | + FlowLayout(alignment: int, hgap: int, vgap: int)   | Creates a FlowLayout manager with specified alignment hgap, vgap.
*/

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ShowFlowLayout extends JFrame{
    public ShowFlowLayout(){
        // Set FlowLayout, aligned left with horizontal gap 10 and vertical gap 20 between the component
        setLayout(new FlowLayout(FlowLayout.LEFT, 10 , 20)); // Container method

        // Add labels and text fields to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
        add(new JLabel("Class"));
        add(new JTextField(5));
    }
}

public class _02FlowLayout {
    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();

        frame.setTitle("ShowFlowLayout");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
