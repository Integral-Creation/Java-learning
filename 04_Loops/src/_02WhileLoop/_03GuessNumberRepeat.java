package _02WhileLoop;

import java.util.Scanner;

public class _03GuessNumberRepeat {
    public static void main(String[] args) {
        int guess;
        int numTrue = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("What is your guess: ");
            guess = scanner.nextInt();

            if(guess == numTrue){
                System.out.println("yes the number is "+ numTrue);
                break;
            }
            else if(guess > numTrue){
                System.out.println("your guess is too high");
            }
            else {
                System.out.println("your guess is too low");
            }
        }
    }
}
