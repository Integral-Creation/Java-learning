package _02ProcessingTwoDimensionalArray;

public class _03sum2dArray {
    // Summing Column Element 
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for(int c = 0; c < arr[0].length; c++ ){
            int total = 0;
            for(int r = 0; r < arr.length; r++){
                total += arr[r][c];
            }
            System.out.println("sum of column "+c+" is: "+total);
        }
    }
}
