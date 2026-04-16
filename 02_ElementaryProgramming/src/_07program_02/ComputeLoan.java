package _07program_02;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        user input annual interest rate in percent
        System.out.print("Enter the annual interest rate eg: 7.5% = ");
        double annualInterest = scanner.nextDouble();

//        user input number of year
        System.out.print("Enter the number of year = ");
        int numberOfYear = scanner.nextInt();

//        user input amount of loan
        System.out.print("Enter the loan amount");
        double amountLoan = scanner.nextDouble();

//        computing monthly interset rate
        double monthlyInterset = annualInterest / 1200;

//        calculate payment
        double monthlyPayment = (amountLoan * monthlyInterset)/(1 - 1 / (Math.pow( 1 + monthlyInterset, numberOfYear * 12)));
        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("Monthly payment = $"+monthlyPayment);
        System.out.println("Total payment = $"+totalPayment);

        scanner.close();
    }
}
