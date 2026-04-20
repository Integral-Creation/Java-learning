package _09Excercises;

import java.util.Arrays;
import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads ten integers and dis
plays them in the reverse of the order in which they were read.
*/
public class _02program {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        String str = Arrays.toString(arr);
        System.out.print("order array: ");
        System.out.println(str);

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        String str1 = Arrays.toString(arr);
        System.out.print("reverse array: ");
        System.out.println(str1);
        scanner.close();
    }
}
