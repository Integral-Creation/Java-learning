package _10String;

import java.util.Scanner;

public class _02StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string separated by whitespaces:");

        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();
        /*
        enter the string separated by whitespaces:
            welcome to java
            welcome
            to
            java
         */
    }

}
