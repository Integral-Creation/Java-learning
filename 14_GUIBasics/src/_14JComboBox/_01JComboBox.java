/*
    JComboBox
        JComboBox is a swing component that display the dropdown list of items
    • Constructor
        JComboBox<String> combo = new JComboBox<>();

    • Common method
                 javax.swing.JComponent
                           ▲
                           │
+--------------------------------------------------------------+
|                 javax.swing.JComboBox                        |
+--------------------------------------------------------------+
| + addItem(item: Object): void                                |
| + insertItemAt(item: Object, index: int): void               |
| + removeItem(item: Object): void                             |
| + removeItemAt(index: int): void                             |
| + removeAllItems(): void                                     |
| + getItemAt(index: int): Object                              |
| + getItemCount(): int                                        |
| + getSelectedItem(): Object                                  |
| + getSelectedIndex(): int                                    |
| + setSelectedIndex(index: int): void                         |
| + setSelectedItem(obj: Object): void                         |
| + setEditable(editable: boolean): void                       |
| + isEditable(): boolean                                      |
| + addActionListener(listener: ActionListener): void          |
| + setMaximumRowCount(n: int): void                           |
+---------------------------------------------------------------+
*/

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class myJComboBox extends JFrame implements ActionListener{
    
    JComboBox<String> comboBox;

    public myJComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animal = {"Cat" , "Dog", "Lion", "Tiger"};
        comboBox = new JComboBox<>(animal);

        comboBox.addActionListener(this);
        
        // comboBox.setEditable(true);
        // comboBox.addItem("Horse");
        // comboBox.setSelectedIndex(1);
        // comboBox.removeItem("Lion");
        // comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }

}

public class _01JComboBox {
    public static void main(String[] args) {
        JFrame frame = new myJComboBox();
        frame.setLocationRelativeTo(null);
    }
}
