package ProgrammingExcercise;

import javax.swing.*;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String input = JOptionPane.showInputDialog(null,"enter an integer");
        int value = Integer.parseInt(input);
        int sum = 0;
        for(int i = 1; i <= value; i++){
            sum += i;
        }
        JOptionPane.showMessageDialog(null,sum);
    }
}
