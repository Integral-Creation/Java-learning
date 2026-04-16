package _02ProcessingArray;

import java.util.Scanner;

public class _01InputValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array declaration
        int[] arr;
        // array creation
        arr = new int[5];

        // initializing array
        for(int i = 0;i < arr.length; i++){
            System.out.print("enter: ");
            arr[i] = scanner.nextInt();
        }

        // displaying array
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}
