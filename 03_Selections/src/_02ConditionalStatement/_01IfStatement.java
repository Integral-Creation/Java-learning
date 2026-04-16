package _02ConditionalStatement;

import java.util.Scanner;

public class _01IfStatement {
    public static void main(String[] args) {
        /*
        if statement execute the statement only if the condition is true.
        syntax:
        if(condition){
            statement;
        }
                input
                  |
                  |
                  v
              expression------------false
                  | true              |
                  |                   |
              Statement               |
                  |<------------------|
                  |
                  v
                output

         */
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        if(radius >= 0 ){
            System.out.println("area of circle is " + (radius * radius * 3.14) + "cm²");
        }
        else{
            System.out.println("radius can't be less than zero");
        }
    }
}
