/*
    JProgressBar:
        JProgressBar is a Swing component that is used to show the progress og the task. it is visually show that how much task has been task has been completed.
    
    • Syntax:
        JProgressBar progressBar = new JProgressBar();
*/

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

class myProgressBar extends JFrame {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    public myProgressBar(){
        frame.setTitle("showProgressBar");
        
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        
        bar.setFont(new Font("MV boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        int counter = 500;

        while(counter > 0){
            bar.setValue(counter);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            counter -=10;
        }
        bar.setString("Done!");
    }
}

public class _JProgressBar {
    public static void main(String[] args) {
        JFrame frame = new myProgressBar();
        frame.setLocationRelativeTo(null);
    }
}
