package _03input;

import java.util.Scanner;
public class ComputeAverage {
    public static void main(){
        // creating a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter values");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double average = (num1+num2+num3)/3;

        System.out.println("Average: "+ average);

        scanner.close();
    }
}
