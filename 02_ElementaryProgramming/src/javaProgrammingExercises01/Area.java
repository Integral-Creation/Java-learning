package javaProgrammingExercises01;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        // creating a scanner
        Scanner scanner = new Scanner(System.in);

        // input length
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

//        scanner.nextLine(); // clearing the buffer // unnecessary

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of the rectangle is: "+ area +"cm²"); // Numlock + alt + 0178

        scanner.close();
    }
}
