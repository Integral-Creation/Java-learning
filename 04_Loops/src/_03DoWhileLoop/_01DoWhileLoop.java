package _03DoWhileLoop;

import java.util.Scanner;

public class _01DoWhileLoop {
    public static void main(String[] args) {
        /*
        do while loop is the same as the while loop except that it execute the loop body first and then checks the
        loop continuation condition

        syntax:
            do{
                statement;
            }(loop continuation condition);
         */
        int data, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("enter the int (if its zero it will stop)");
            data = scanner.nextInt();
            sum += data;
        }while (data != 0);

        System.out.println(sum);

    }
}
