import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myMenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu filMenu; 
    JMenu editMenu; 
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    

    public myMenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("14_GUIBasics/src/icons8-file-30.png");
        saveIcon = new ImageIcon("14_GUIBasics/src/icons8-save-30.png");
        exitIcon = new ImageIcon("14_GUIBasics/src/icons8-exit-30.png");

        menuBar = new JMenuBar();
        filMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        filMenu.setMnemonic(KeyEvent.VK_F); // alt + l for load
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + s for load
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + e for load

        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for load
        exitItem.setMnemonic(KeyEvent.VK_E); // e for load

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        filMenu.add(loadItem);
        filMenu.add(saveItem);
        filMenu.add(exitItem);

        menuBar.add(filMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loadItem){
            System.out.println("you loaded a file");
        }
        if(e.getSource() == saveItem){
            System.out.println("you saved a file");
        }
        if(e.getSource() == exitItem){
            System.exit(0);
        }

    }

}

public class _01JMenuBar {
    public static void main(String[] args) {
        JFrame frame = new myMenuBar();
        frame.setLocationRelativeTo(null);
    }
}
