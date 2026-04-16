package _01Boolean;

import java.util.Scanner;
public class _04Boolean {
    public static void main(String[] args) {
        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() / 7 % 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is "+number1+" + "+ number2 + " ?");
        int answer = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        scanner.close();

    }
}
