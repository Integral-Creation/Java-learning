package _04arithematicOperator;

import java.util.Scanner;

public class DisplayTime01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer for seconds");
        int seconds = scanner.nextInt();

        int min = seconds/60;
        int remainingSec = seconds%60;
        System.out.println(seconds+" sec is "+min+" minute "+remainingSec+" seconds");
        scanner.close();
    }
}
