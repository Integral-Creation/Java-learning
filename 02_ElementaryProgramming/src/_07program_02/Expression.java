package _07program_02;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x (int) = ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y (int) = ");
        int y = scanner.nextInt();
        System.out.print("Enter the value of z (int) = ");
        int z = scanner.nextInt();
        System.out.print("Enter the value of X (int) = ");
        int X = scanner.nextInt();

        double arithmeticExpression = ((5 * x) + (Math.pow(y - z, (double) 2 / 3))) / (3 * Math.pow(x , 3) + (4 * X));
        System.out.println("ans : " + arithmeticExpression);

        scanner.close();
    }
}
