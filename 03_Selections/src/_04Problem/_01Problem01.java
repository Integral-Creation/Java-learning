package _04Problem;

import java.util.Scanner;

public class _01Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilogram");
        double weightInKilo = scanner.nextDouble();

        System.out.print("Enter your height in m");
        double height = scanner.nextDouble();

        double BMI = weightInKilo / (height * height);

        if(BMI > 30.0){
            System.out.println("Obese");
        }
        else if(BMI <= 29.9 && BMI >= 25.0){
            System.out.println("Overweight");
        }
        else if(BMI <= 24.9 && BMI >= 18.5){
            System.out.println("Normal");
        }
        else{
            System.out.println("Underweight");
        }
        scanner.close();
    }
}
