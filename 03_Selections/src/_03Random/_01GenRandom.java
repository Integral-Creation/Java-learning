package _03Random;

import java.util.Scanner;

public class _01GenRandom {
    public static void main(String[] args) {
        /*
        generating random number:
            use math.random to generate random number between [0.0,1.0) datatype is double
            previous we use System.currentTimeMillis() to generate number, but it can be +ive -ive or zero
            here it strictly lie btw [0.0,1.0) excluding 1.0
         */
        Scanner scanner = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        // swap num if num1 < num2
        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // prompt
        System.out.println("what is "+num1+" + "+ num2 + " ?");
        int answer = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
    }
}
