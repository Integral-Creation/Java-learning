package _06DataFieldEncapsulation;
/*
    -----------------------------------------
    |            Bank Account               |
    -----------------------------------------
    | -balance: double                      |
    | -accountNumber: int                   |
    | -owner : String                       |
    -----------------------------------------
    | +getBalance(): double                 |
    | +deposit(double: amt)                 |
    | +withdraw(double: amt)                |
    | -validate(double: amt)                |
    -----------------------------------------
*/

class BankAccount{
    // Private fields
    private double balance;
    private double accountNumber;
    private String owner;

    // Constructor
    BankAccount(String owner, double accountNumber, double balance){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // public getter
    public double getBalance(){
        return balance;
    }

    public String owner(){
        return owner;
    }

    // Deposit method
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }else{
            throw new IllegalArgumentException("Deposit must be positive.");
        }
    }

    public boolean withdraw(double amt){
        if(validate(amt)){
            balance -= amt;
            return true;
        }
        return false;
    }

    private boolean validate(double amt){
        return amt > 0 && amt <= balance;
    }
}

public class _02dataFieldEncapsulation {
    public static void main(String[] args) {
        BankAccount acc01 = new BankAccount("Nikola Tesla", 369, 1000000.0);

        acc01.deposit(155555);
        System.out.println(acc01.getBalance());
    }
}


