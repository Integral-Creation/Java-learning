package _02ProcessingArray;

import java.util.Scanner;

public class _02ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array declaration
        int[] arr;
        // array creation
        arr = new int[5];
        int total = 0;

        for(int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        System.out.println(total);



        scanner.close();
    }
}
