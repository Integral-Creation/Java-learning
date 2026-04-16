package _10ConfirmationDialogs;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class _02Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        String answer;
        answer = JOptionPane.showInputDialog(null,"Enter an Input",
                "What is the value of:"+num1+" + "+num2+" ?",JOptionPane.QUESTION_MESSAGE);

        int entered = Integer.parseInt(answer);

        if ((num1 + num2) == entered){
            JOptionPane.showMessageDialog(null, "You are correct!");
        }
        else {
            JOptionPane.showMessageDialog(null, "you are wrong!");
        }

        scanner.close();
    }
}
