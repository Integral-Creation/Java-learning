package _02ConditionalStatement;

import java.util.Scanner;

public class _02ifDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer");
        int num = scanner.nextInt();

        if(num % 5 == 0){
            System.out.println("Hi five");
        }
        if(num % 2 ==0){
            System.out.println("Hi even");
        }
    }
}
