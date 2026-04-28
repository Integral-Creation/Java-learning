package _01MultidimensionalArraysBasic;

public class _01multiArray {
    /*
    Multidimensional Arrays 
        multi-dimensional arrays in java is an array of arrays that allows data to store in a tabular form such as row or column. Its is commonly used to represent matrics, grid, and table in a program.

    Declaring 2D Arrays
        syntax:
            elementType[][] arrayRefVar;
            
    Declaring 3d Arrays
        Syntax: 
            elementType[][][] arrayRefVar;

    */  
    public static void main(String[] args) {
        // Declaring a two-dimensional array
        int[][] matrix;

        // Initializing rows and column sizes
        matrix = new int[5][5];

        // Assigning values
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 3;

        // Array initializer
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10}
        };

        System.out.println(arr[0][2]); // output: 3

        // Declaring & Initializing 3D Array
        int[][][] arr3D = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };

        System.out.println(arr3D[0][1][2]); // output: 6
        
    }
}