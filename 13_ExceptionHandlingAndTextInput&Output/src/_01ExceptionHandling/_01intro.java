package _01ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception Handling:
    • An event that interrupts the normal flow of a program(Dividing by zero, file not found, mismatch input type) surround any dangerous code.
    • try{}, catch{}, finally{}
*/

/*
syntax:
    try{
        code to run;
        A statement or a method that may throw an exception;
    }catch(type e){
        Code to process the exception;
    }
*/

public class _01intro {
    public static void main(String[] args) {
        // System.out.println( 1 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero

        try{
            System.out.println(1 / 0);
        }catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO");
        }

        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }catch(InputMismatchException i){
            System.out.println("That wasn't a number");
        }catch(Exception e){
            System.out.println("Something went wrong");  
        }
        finally{
            scanner.close();
        }

    }
}
