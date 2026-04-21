package _09Excercises;

import java.util.Scanner;

/*
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0. 

Here is a sample run of the program:
Enter the integers between 1 and 100: 
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
*/
public class _03program {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);

        int[] count = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        int num;
        while(scanner.hasNextInt()){
            num = scanner.nextInt();

            if(num == 0) break;
            if(num >= 1 && num <= 100){
                count[num]++;
            }
        }
        
        scanner.close();

        for(int i = 1; i <= 100; i++){
            if(count[i] == 1){
                System.out.println(i + " occurs 1 time");
            }else if(count[i] == 0) continue;
            else{
                System.out.println(i + " occurs "+ count[i] + " times");
            }
        }
    }
}
