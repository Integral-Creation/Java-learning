package _03Passing2dArrayToMethods;

import java.util.Scanner;

public class _01pass2dArrayToMethods {
    public static int[][] getArray(){
        Scanner scanner = new Scanner(System.in);
        int [][] m = new int[3][3];

        System.out.println("enter "+m.length+" rows and "+m[0].length+" columns");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return m;
    }

    public static int sum(int[][] m){
        int total = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                total += m[i][j];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] arr = getArray();

        System.out.println("sum of all elements: "+sum(arr));
    }
}
