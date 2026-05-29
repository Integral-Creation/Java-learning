package _04ClassAbstractionAndEncapsulation;
import java.util.Scanner;
/*

-----------------------------------------
|                 Loan                 |
-----------------------------------------
| - annualInterestRate : double        |
| - numberOfYears : int                |
| - loanAmount : double                |
| - loanDate : java.util.Date          |
-----------------------------------------
| + Loan()                             |
| + Loan(annualInterestRate : double,  |
|        numberOfYears : int,          |
|        loanAmount : double)          |
| + getAnnualInterestRate() : double   |
| + getNumberOfYears() : int           |
| + getLoanAmount() : double           |
| + getLoanDate() : java.util.Date     |
| + setAnnualInterestRate(             |
|      annualInterestRate : double)    |
|      : void                          |
| + setNumberOfYears(                  |
|      numberOfYears : int) : void     |
| + setLoanAmount(                     |
|      loanAmount : double) : void     |
| + getMonthlyPayment() : double       |
| + getTotalPayment() : double         |
-----------------------------------------
*/

class loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // Default Constructor
    public loan(){
        this(2.5, 1, 1000);
    }

    // Parameterize Constructor
    public loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // return annualInterestRate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    // Set a new annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    // return numberOfYears
    public int getNumberOfYears(){
        return numberOfYears;
    }

    // Set a new numberOfYears
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    // return loanAmount
    public double getLoanAmount(){
        return loanAmount;
    }

    // Set a new loanAmount
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    // find monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        return monthlyPayment;
    }
    
    // find total payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    // return loan date
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}


public class loanCaseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = scanner.nextInt();

        System.out.println("Enter loan for example, 120000.95: ");
        double loanAmount = scanner.nextDouble();

        loan loan01 = new loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("the loan was created on %s\n" + "the monthly payment is %.2f\n the total payment is %.2f\n", loan01.getLoanDate().toString(), loan01.getMonthlyPayment(), loan01.getTotalPayment());
        scanner.close();
    }
}