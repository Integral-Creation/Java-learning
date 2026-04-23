package _02ProcessingTwoDimensionalArray;

public class _04largestSum2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxRow = Integer.MIN_VALUE;
        int maxRowIndex = Integer.MIN_VALUE;

        for(int r = 0; r < arr.length; r++){
            int totalRow = 0;
            for(int c = 0; c < arr[r].length; c++){
                totalRow += arr[r][c];
            }

            if(totalRow > maxRow){
                maxRow = totalRow;
                maxRowIndex = r;
            }
        }

        System.out.println("Max of the row: "+maxRow);
        System.out.println("Max row index: "+maxRowIndex);
    }
}
