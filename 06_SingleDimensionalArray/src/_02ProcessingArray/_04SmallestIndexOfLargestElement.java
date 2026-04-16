package _02ProcessingArray;

import java.util.Scanner;

public class _04SmallestIndexOfLargestElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[8];

        for(int i = 0; i<arr.length ;i++){
            System.out.println("enter: ");
            arr[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i = 0; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
        scanner.close();
    }
}
