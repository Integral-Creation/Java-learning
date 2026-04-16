package _02WhileLoop;

import java.util.Scanner;

public class _02RepeatAdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the answer of "+num1+" + "+num2+"?");
        int answer = scanner.nextInt();
        while((num1 + num2) != answer){
            System.out.print("wrong answer try again! ");
            System.out.print("What is the answer of "+num1+" + "+num2+"?");
            answer = scanner.nextInt();
        }
        System.out.println("you got it");
        scanner.close();
    }
}
