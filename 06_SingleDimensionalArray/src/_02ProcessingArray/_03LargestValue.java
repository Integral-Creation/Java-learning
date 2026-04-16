package _02ProcessingArray;

import java.util.Scanner;

public class _03LargestValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for(int i = 0; i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
