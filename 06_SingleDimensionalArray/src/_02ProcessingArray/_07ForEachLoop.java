package _02ProcessingArray;

import java.util.Scanner;

public class _07ForEachLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
