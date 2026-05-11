package _04ClassAbstractionAndEncapsulation;

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
public class loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // default constructor 
    public loan(){
        this(2.5, 1, 1000);
    }

    public loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // return annualIntersetRate
    public double annualInterestRate(){
        return annualInterestRate;
    }

    // Set a new annualIntersetRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    // return noOfYears
    public int getNumberOfYears(){
        return numberOfYears;
    }

    // set noOfYears
    public int setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    // return loanAmount
    public double getLoanAmount(){
        return loanAmount;
    }

    // set a new laonAmount
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    // mountly payment
    public double getMonthlyPayment(){
        double mountlyIntersetRate = annualInterestRate / 1200;
        double mountlyPayment = loanAmount * mountlyIntersetRate / (1 - (1 / Math.pow(1 + mountlyIntersetRate, numberOfYears * 12)));
        return mountlyPayment;
    }




    
}
