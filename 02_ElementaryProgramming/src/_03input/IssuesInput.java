package _03input;

import java.util.Scanner;

public class IssuesInput {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        // so get rid of the "\n" new line character use---> scanner.nextLine();
        scanner.nextLine(); // clear the input buffer

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();


        System.out.println("your age is "+ age);
        System.out.println("Your favourite color is "+ color);
        /*
        output:
        enter your age: 20 <-------when you hit enter a new line "\n" character is act as the input for the next scanner or it's in the input buffer
        Enter your favourite color: your age is 20
        Your favourite color is
         */
        scanner.close();
    }
}
