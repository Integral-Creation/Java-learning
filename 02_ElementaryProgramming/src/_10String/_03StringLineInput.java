package _10String;

import java.util.Scanner;

public class _03StringLineInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the line statement");
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();
    }
}
