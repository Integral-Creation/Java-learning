package _06LoopQuestions;

import java.util.Scanner;

public class _02PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int isPrime = 1;
        if(value <= 0){
            System.out.println("not prime");
            return;
        } else{
            for(int i = 2; i <= value / 2; i++){
                if(value % i == 0){
                    isPrime = 0;
                    break;
                }
            }
        }

        if(isPrime == 1){
            System.out.println("Prime");
        } else{
            System.out.println("Not prime");
        }
    }
}
