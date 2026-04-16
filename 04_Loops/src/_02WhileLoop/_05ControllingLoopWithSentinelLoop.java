package _02WhileLoop;

import java.util.Scanner;

public class _05ControllingLoopWithSentinelLoop {
    public static void main(String[] args) {
        // page-141
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter an int (the input ends if it is 0)");
        int data = scanner.nextInt();
        int sum = 0;
        while(data != 100){
            sum += data;
            System.out.print("enter an int (the input ends if it is 0)");
            data = scanner.nextInt();

        }
        System.out.println(sum);
        scanner.close();
    }
}
