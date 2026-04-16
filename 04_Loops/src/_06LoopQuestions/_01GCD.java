package _06LoopQuestions;

import java.util.Scanner;

public class _01GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first value: ");
        int num1 = scanner.nextInt();
        System.out.print("enter second value: ");
        int num2 = scanner.nextInt();

        int max, min;
        if(num1 > num2){
            max  = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        int gcd = 1;
        for( int k = 2; (k <= min) && (k <= max) ; k++){
            if((max % k == 0) && (min % k == 0)){
                gcd = k;
            }
        }
        System.out.println("gcd: "+gcd);
        scanner.close();
    }
}
