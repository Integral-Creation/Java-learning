package _02ProcessingTwoDimensionalArray;

import java.util.Scanner;

public class _01arrayInput2dArray {
    public static void main(String[] args){
        java.util.Scanner scanner = new Scanner(System.in);
        
        // initializing 2d Array
        int[][] matrix = new int[3][3];

        System.out.print("enter "+matrix.length+" rows and "+matrix[0].length+" columns: ");
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                matrix[r][c] = scanner.nextInt();
            }
        }
        scanner.close();

        // Printing arrays
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}
