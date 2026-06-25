package _04MoreExceptionHandling;

/*
    Unchecked exception:
        unchecked exception is created by extending the RuntimeException.
*/

class InsufficientBalance extends RuntimeException{
    public InsufficientBalance(String message){
        super(message);
    }
}

public class _07definingCustomExceptionClasses {
    static void withdraw(double balance, double amount){
        if(amount > balance){
            throw new InsufficientBalance("Insufficient, Available Balance: " + balance);
        }

        System.out.println("Withdraw Successful");
    }

    public static void main(String[] args) {
        System.out.println("Withdraw 1st");
        withdraw(10000, 20000);
    }
    /*output:
        Withdraw 1st
            Exception in thread "main" _04MoreExceptionHandling.InsufficientBalance: Insufficient, Available Balance: 10000.0
    */
}
