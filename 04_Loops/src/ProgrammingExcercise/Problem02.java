package ProgrammingExcercise;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        int value = scanner.nextInt();

        while(value * 10 <= 100){
            System.out.print("enter a number: ");
            value = scanner.nextInt();
        }
    }
}
