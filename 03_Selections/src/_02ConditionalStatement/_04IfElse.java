package _02ConditionalStatement;

import java.util.Scanner;

public class _04IfElse {
    public static void main(String[] args) {
        /*
        if - else statement decides which statement to execute based on whether the condition is true or false.

        syntax:
                if(boolean expression){
                    statement;
                }
                else(boolean expression){
                    statement;
                }
         */
        // example

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if(value % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
