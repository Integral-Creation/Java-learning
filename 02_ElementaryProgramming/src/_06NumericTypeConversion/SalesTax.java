package _06NumericTypeConversion;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount purchase: ");
        double purchaseAmount = scanner.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $"+(int) tax);

        scanner.close();
    }
}
