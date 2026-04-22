package _01MultidimensionalArraysBasic;

public class _03jaggedArray {
    public static void main(String[] args) {
        /*
        Jagged array is a multidimesional array in which each row an have a different no of columns.
        */
       int[][] triArr = {
        {1,2,3,4,5},
        {1,2,3,4},
        {1,2,3},
        {1,2},
        {1}
       };

       for(int i = 0; i < triArr.length; i++){
        System.out.println("Length of a "+i+" index row array: "+triArr[i].length);
       }
       /*
       output: 
        Length of a 0 index row array: 5
        Length of a 1 index row array: 4
        Length of a 2 index row array: 3
        Length of a 3 index row array: 2
        Length of a 4 index row array: 1
       */


    }
}
