package _09Excercises;

import java.util.Scanner;

/*
(Print distinct numbers) Write a program that reads in ten numbers and displays
distinct numbers (i.e., if a number appears multiple times, it is displayed only
once). (Hint: Read a number and store it to an array if it is new. If the number is
already in the array, ignore it.) After the input, the array contains the distinct num
bers. Here is the sample run of the program:
*/
public class _05program {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        int[] numbers = new int[10];
        int num;
        int count = 0;
        while(count < 10 && scanner.hasNextInt()){
            num = scanner.nextInt();

            boolean isDuplicate = false;
            for(int i = 0; i < count; i++){
                if(numbers[i] == num){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                numbers[count] = num;
                count++;
            }
            
        }
        scanner.close();

        System.out.print("the distinct numbers are: ");
        for(int i = 0; i <= 10; i++){
            System.out.print(numbers[i] +" ");
        }
    }
}
