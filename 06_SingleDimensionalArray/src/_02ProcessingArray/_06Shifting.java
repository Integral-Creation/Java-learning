package _02ProcessingArray;

import java.util.Scanner;

public class _06Shifting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[8];

        for(int i = 0; i<arr.length ;i++){
            System.out.print("enter: ");
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[(arr.length-i-1)];
            arr[(arr.length-i-1)] = temp;
        }

        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
