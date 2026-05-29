package _04arithmeticOperator;

import java.util.Scanner;

public class DisplayTime02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in minute: ");
        int minute = scanner.nextInt();

        int sec = minute*60;

        System.out.println(minute+" minute is "+sec+" seconds");
        scanner.close();
    }
}
