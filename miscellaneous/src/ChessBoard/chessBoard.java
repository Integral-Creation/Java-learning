package ChessBoard;

import java.awt.*;
import javax.swing.*;

public class chessBoard extends JFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton[] buttons = new JButton[64];

    public chessBoard(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        panel.setLayout(new GridLayout(8,8));
        panel.setBackground(Color.gray);

        for(int i = 0; i < 8; i++){
    
            if(i % 2 == 0){
                for(int j = 0; j < 8; j++){
                    buttons[j] = new JButton(); 
                    panel.add(buttons[j]);
                    buttons[j].setFocusable(false);
                    if( j % 2 == 0){
                        buttons[j].setBackground(Color.white);
                    }else{
                        buttons[j].setBackground(Color.black);
                    }
                } 
            }else{
                for(int j = 0; j < 8; j++){
                    buttons[j] = new JButton(); 
                    panel.add(buttons[j]);
                    buttons[j].setFocusable(false);
                    if( (j) % 2 == 0){
                        buttons[j].setBackground(Color.black);
                    }else{
                        buttons[j].setBackground(Color.white);
                    }
                } 
            }
        }

        frame.add(panel);
    }
}
