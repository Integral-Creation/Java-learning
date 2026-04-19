package _08ArrayClass;

import java.util.Arrays;

public class _01arrayClass {
    public static void main(String[] args) {
        int[] array = {5,2,8,1,9};

        // • sort
        Arrays.sort(array);
        System.out.print("sorted array: ");
        for(int i: array){
            System.out.print(i+" ");
        }

    System.out.println();        

        // • binary search
        int idx = Arrays.binarySearch(array, 1); // return index of 1
        System.out.print("index of element 1 in the array: ");
        System.out.print(idx);

    System.out.println();        

        // • copy 
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.print("copy of the array: ");
        for(int i: copy){
            System.out.print(i+ " ");
        }

        System.out.println();

        // • fill
        int[] array2 = new int[array.length];
        System.out.print("array fill: ");
        Arrays.fill(array2, 0);
        for(int i : array2){
            System.out.print(i+" ");
        }

        System.out.println();

        // • compare
        boolean val = Arrays.equals(array, array2);
        System.out.println("is array and array2 equals? "+val);


        // • toString
        String str = Arrays.toString(array);
        System.out.print("string of the array: ");
        System.out.print(str);
    }
}
