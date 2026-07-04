/*
(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Sum: " + (a + b));
        }catch(InputMismatchException e){
            System.out.println("Incorrect Input");
        }
        scanner.close();
    }
}
