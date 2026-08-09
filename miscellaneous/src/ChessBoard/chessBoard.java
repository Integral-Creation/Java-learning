package ChessBoard;

import java.awt.*;
import javax.swing.*;

public class chessBoard extends JFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton[][] buttons = new JButton[8][8];

    public chessBoard(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        panel.setLayout(new GridLayout(8,8));
        panel.setBackground(Color.gray);

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                buttons[i][j] = new JButton();
                panel.add(buttons[i][j]);
                buttons[i][j].setFocusable(false);
                buttons[i][j].setOpaque(true);

                if((i + j) % 2 == 0){
                    buttons[i][j].setBackground(Color.white);
                }else{
                    buttons[i][j].setBackground(Color.black);
                }
            }
        }

        frame.add(panel);
    }
}
