package _01Boolean;

import java.util.Scanner;

public class _01Intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area;
        if(radius < 0){
            System.out.println("Incorrect input");
        }
        else{
            area = radius * radius * 3.14;
            System.out.println("Area :" + area);
        }
    }
}
