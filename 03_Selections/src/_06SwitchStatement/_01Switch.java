package _06SwitchStatement;

import java.util.Scanner;

public class _01Switch {
    public static void main(String[] args) {
        /*
        Switch statement execute the statement based on the value of variable or an expression
        syntax:
            switch (status){
                case 0:{
                    statement;
                    break; // very crucial
                }
                case 1:{
                    statement;
                    break; // very crucial
                }
                default:{
                    statement;
                }
            }

         */
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch(value){
            case 1:{
                System.out.println(1);
                break;
            }
            case 2:{
                System.out.println(2);
                break;
            }case 3:{
                System.out.println(3);
                break;
            }
            case 4:{
                System.out.println(4);
                break;
            }
            default:{
                System.out.println("value > 4");
            }

        }
        scanner.close();
    }
}
