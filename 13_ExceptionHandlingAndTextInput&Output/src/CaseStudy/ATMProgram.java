import java.util.InputMismatchException;
import java.util.Scanner;

/** Create a menu-driven ATM program with the following options:

1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Requirements:

Handle invalid menu choices.
Handle non-integer input.
Throw NegativeAmountException for negative deposits or withdrawals.
Throw InsufficientBalanceException when withdrawing more than the available balance.
Use try-catch-finally.
Display "Thank you for using the ATM." in the finally block after each transaction attempt.
*/

class ATMGlobal{
    private String name;
    private double balance;

    ATMGlobal(){
        this.name = "Unknown";
        this.balance = 0.0;
    }

    ATMGlobal(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void Deposit(double amount) throws NegativeAmountException {
        if(amount < 0){
            throw new NegativeAmountException("Amount cannot be Negative!");
        }
        this.balance += amount;
        System.out.println("============Successfully Deposited============");
    }

    public void Withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if(amount < 0){
            throw new NegativeAmountException("Amount cannot be Negative!");
        }

        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance in your Bank Account");
        }
        this.balance -= amount;
        System.out.println("============Successfully Withdrawn============");
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

class NegativeAmountException extends RuntimeException{
    public NegativeAmountException(String msg){
        super(msg);
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

public class ATMProgram {
    public static void menu(){
        System.out.println("________ATM__________");
        System.out.println("1. Create new Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
    }

    private static String readStr(Scanner scanner, String prompt){
        while(true){
            System.out.print(prompt);
            String name = scanner.nextLine().trim();


            if(!name.isEmpty()){
                return name;
            }
            System.out.println("Invalid! Please Enter again!");
        }
    }

    private static double readDouble(Scanner scanner, String prompt){
        while(true){
            System.out.print(prompt);
            try{
                double amount = scanner.nextDouble();
                scanner.nextLine();
                return amount;
            }catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Invalid! Please Enter again!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMGlobal customer = new ATMGlobal();

        boolean running = true;
        int choice;

        while(running){
            menu();
            System.out.print("Enter Your Choice: ");
            try{
                choice = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid Input!");
                scanner.nextLine();
                continue;
            }
            
            scanner.nextLine();

            switch(choice){
                case 1:

                    String nameString = readStr(scanner, "Enter Your Name: ");
                    double balance = readDouble(scanner, "Enter Initial Balance: ");

                    customer = new ATMGlobal(nameString, balance);
                    System.out.println();
                    System.out.println("Account Successfully Created!");
                    System.out.println("Congratulation for Becoming A Part of Our Family!");
                    System.out.println();
                    break;
                case 2:
                    try{
                        double amountDeposit = readDouble(scanner, "Enter the Amount You want to Deposit: ");
                        customer.Deposit(amountDeposit);
                    }catch(NegativeAmountException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3: 
                    try{
                        double amountWithdraw = readDouble(scanner, "Enter the Amount You Want To Withdraw: ");
                        customer.Withdraw(amountWithdraw);
                    }catch(InsufficientBalanceException e){
                        System.out.println(e.getMessage());
                    }catch(NegativeAmountException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Account Detail:___________________");
                    System.out.println("Account Holder Name: " + customer.getName());
                    System.out.println("Balance :" + customer.getBalance());
                    System.out.println("__________________________________");
                    System.out.println();
                    break;

                case 5:
                    running = false;
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("[!] Invalid Choice! Please choice the correct choice from menu.");
            }
        }
        scanner.close();
    }
}
