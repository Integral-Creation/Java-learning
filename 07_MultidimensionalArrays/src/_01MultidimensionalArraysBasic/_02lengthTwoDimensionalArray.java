package _01MultidimensionalArraysBasic;

public class _02lengthTwoDimensionalArray {
    public static void main(String[] args) {
        /*
        Two-dimensional Array is an array of arrays, so it's length is depend upon what we are referring to. 
        */
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        /*
        arr[3][3]
            |   [0][0]  |   [0][1]  |   [0][2]  |   ->row[0].length : 3
            |   [1][0]  |   [1][1]  |   [1][2]  |   ->row[1].length : 3
            |   [2][0]  |   [2][1]  |   [2][2]  |   ->row[2].length : 3
        */

        // total no of rows
        System.out.println(arr.length); // output: 3 -> no of rows in an array

        // no of column in a specific rows
        System.out.println(arr[0].length); // output: 3 -> no of columns in a array arr[0]

        
    }
}
