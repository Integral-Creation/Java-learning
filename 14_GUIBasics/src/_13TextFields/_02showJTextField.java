import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myTextField extends JFrame implements ActionListener {

    JTextField textField;
    JButton jbt;

    myTextField(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        jbt = new JButton("Submit");
        jbt.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("UserName");

        this.add(jbt);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource() == jbt){
            System.out.println("Welcome " +textField.getText());
            jbt.setEnabled(false);
            textField.setEditable(false);
        }
    }
}

public class _02showJTextField {
    public static void main(String[] args) {
        JFrame frame = new myTextField();
        frame.setLocationRelativeTo(null);
    }
}