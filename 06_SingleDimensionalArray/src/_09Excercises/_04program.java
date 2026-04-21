package _09Excercises;

import java.util.Scanner;

/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.
*/

public class _04program {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        
        int[] marks = new int[101];

        System.out.print("enter the marks between 0 to 100: ");

        int val;
        int total = 0;
        int count = 0;
        while(scanner.hasNextInt()){
            val = scanner.nextInt();
            if(val < 0) break;
            if(val >= 0 && val <= 100){
                marks[val]++;
                total += val;
                count++;
            }
        }
        scanner.close();

        if (count == 0) {
            System.out.println("No valid scores entered.");
            return;
        }
        
        int aboveAvg = 0;
        int belowAvg = 0;
        int avg = total / count;
        for(int i = 0; i <= 100;i++){
            if(marks[i] > 0){
                if(i >= avg){
                    aboveAvg += marks[i];
                }else{
                    belowAvg += marks[i];
                }
            }
        }

        System.out.println(aboveAvg + " scores above avg");
        System.out.println(belowAvg + " scores below avg");

        
    }
}
