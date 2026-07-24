/*
    JFileChooser
        It is a swing component that provides a standard dialog for selecting files or folder.
        It lets user open file or save file, or choose directories instead of typing the path manually.\

    • Import
        import javax.swing.JFileChooser;
    • Constructor
        JFileChooser chooser = new JFileChooser();
*/

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.JFileChooser;

class myFileChooser extends JFrame implements ActionListener{

    JButton jbt;

    public myFileChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600,500);

        jbt = new JButton("Select File");
        jbt.addActionListener(this);

        this.add(jbt);
        this.pack();
        this.setVisible(true);
    }

    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == jbt){

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));
            // int response = fileChooser.showOpenDialog(null); // Select file to open
            int response = fileChooser.showSaveDialog(null); // Select file to open

            if(response == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile().getAbsoluteFile();
                System.out.println(file);
            }
        }
    }
}

public class _01JFileChooser {
    public static void main(String[] args) {
        JFrame frame = new myFileChooser();
        frame.setLocationRelativeTo(null);
    }
}