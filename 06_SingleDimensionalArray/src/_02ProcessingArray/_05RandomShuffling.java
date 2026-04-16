package _02ProcessingArray;

import java.util.Scanner;

public class _05RandomShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[8];

        for(int i = 0; i<arr.length ;i++){
            System.out.println("enter: ");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < arr.length ;i++){
            int j = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
