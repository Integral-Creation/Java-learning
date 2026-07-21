import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class myJCheckBox extends JFrame implements ActionListener{

    JButton jbt;
    JCheckBox checkBox;

    ImageIcon checkedIcon;
    ImageIcon uncheckedIcon;

    myJCheckBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkedIcon = new ImageIcon("14_GUIBasics/src/icons8-checked-48.png");
        uncheckedIcon = new ImageIcon("14_GUIBasics/src/icons8-unchecked-50.png");

        jbt = new JButton();
        jbt.setText("submit");
        jbt.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(uncheckedIcon);
        checkBox.setSelectedIcon(checkedIcon);

        this.add(jbt);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource() == jbt){
            System.out.println(checkBox.isSelected());
        }
    }
}

public class _02showJCheckBox {
    public static void main(String[] args) {
        JFrame frame = new myJCheckBox();
        frame.setLocationRelativeTo(null);
    }
}
