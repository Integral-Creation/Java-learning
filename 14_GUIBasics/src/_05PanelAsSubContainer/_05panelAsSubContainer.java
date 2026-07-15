/*
    Panel as a SubContainer
        A container can be placed inside the another container. Panels can be used as the subContainer to group GUI component to achieve the desired layout.

        • Organize component into logical group
        • Each panel can have its own layout manager
        • Simplify the complex GUI design
        • Makes the code more modular and reuseable
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TestPanels extends JFrame {
    public TestPanels(){
        // Create panel p1 for the button and set GridLayout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));

        // Add buttons to the Panel
        for(int i = 1; i <= 9; i++){
            p1.add(new JButton("" + i));
        }

        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        // Create panel p2 to hold a text field and p1
        JPanel p2 = new JPanel(new BorderLayout());

        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        add(new JButton("Food to be placed here"), BorderLayout.CENTER);
        p2.add(p1, BorderLayout.CENTER);

        // Add contents to the Frame
        add(p2, BorderLayout.EAST);
        add(new JButton("Food to be placed here"), BorderLayout.CENTER);
    }
}

public class _05panelAsSubContainer {
    public static void main(String[] args) {
        TestPanels frame = new TestPanels();

        frame.setTitle("The front View of a Microwave Oven");
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
