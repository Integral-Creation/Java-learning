package _02ProcessingTwoDimensionalArray;

public class _05randomShuffling2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                int val1 = (int) Math.random() * arr.length;
                int val2 = (int) Math.random() * arr[r].length;

                int temp = arr[r][c];
                arr[r][c] = arr[val1][val2];
                arr[val1][val2] = temp;
            }
        }

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
