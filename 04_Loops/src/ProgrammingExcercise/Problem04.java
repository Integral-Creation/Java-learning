package ProgrammingExcercise;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the lower bound");
        int lowerBound = scanner.nextInt();
        System.out.print("enter the upper bound");
        int upperBound = scanner.nextInt();

        for(int i = lowerBound ; i <= upperBound; i++){
            System.out.print(i+" ");
        }
    }
}
