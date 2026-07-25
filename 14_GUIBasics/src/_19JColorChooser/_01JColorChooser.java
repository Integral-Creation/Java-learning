/*
    JColorChooser
        JColorChooser is a swing components that provides a standard dialog box for selecting colors.
    
    • Import Statement
        import javax.swing.JColorChooser;
*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


class myJColorChooser extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    public myJColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("MV boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);

            // label.setForeground(color);
            label.setBackground(color);
        }

    }

}


public class _01JColorChooser {
    public static void main(String[] args) {
        JFrame frame = new myJColorChooser();
        frame.setLocationRelativeTo(null);
    }
}
