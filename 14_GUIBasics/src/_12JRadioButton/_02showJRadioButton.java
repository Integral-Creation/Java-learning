import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class myJRadioButton extends JFrame implements ActionListener{

    JRadioButton rbtPizza;
    JRadioButton rbtCoke;
    JRadioButton rbtShake;

    ImageIcon pizza;
    ImageIcon coke;
    ImageIcon shake;

    myJRadioButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        rbtPizza = new JRadioButton("Pizza");
        rbtCoke = new JRadioButton("Coke");
        rbtShake = new JRadioButton("Milkshake");

        pizza = new ImageIcon("14_GUIBasics/src/icons8-pizza-40.png");
        coke = new ImageIcon("14_GUIBasics/src/icons8-coke-48.png");
        shake = new ImageIcon("14_GUIBasics/src/icons8-milkshake-40.png");

        ButtonGroup grp = new ButtonGroup();
        grp.add(rbtPizza);
        grp.add(rbtCoke);
        grp.add(rbtShake);

        rbtPizza.addActionListener(this);
        rbtCoke.addActionListener(this);
        rbtShake.addActionListener(this);

        rbtPizza.setIcon(pizza);
        rbtCoke.setIcon(coke);
        rbtShake.setIcon(shake);

        this.add(rbtPizza);
        this.add(rbtCoke);
        this.add(rbtShake);
        this.pack();
        this.setVisible(true);
    }

    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource() == rbtPizza){
            System.out.println("You ordered Pizza");
        }
        else if(e.getSource() == rbtCoke){
            System.out.println("You ordered Coke");
        }
        else if(e.getSource() == rbtShake){
            System.out.println("You ordered Milkshake");
        }
    }
}

public class _02showJRadioButton {
    public static void main(String[] args) {
        JFrame frame = new myJRadioButton();
        frame.setLocationRelativeTo(null);
    }    
}
