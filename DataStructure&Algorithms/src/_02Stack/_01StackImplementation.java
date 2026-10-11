package _02Stack;

import java.util.Scanner;

public class _01StackImplementation {
    private static int[] array = new int[1000];
    private static int top = -1;

    public static void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }

        array[++top] = data;
    }

    public static boolean isFull(){
        return top == array.length - 1;
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public static void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(array[top]);
    }

    public static void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        for(int i = top; i >= 0; i--){
            System.out.print(array[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // 1. push
        // 2. pop
        // 3. peek

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int op = scanner.nextInt();

            if(op == 1){
                int data = scanner.nextInt();
                push(data);
            }
            else if(op == 2){
                pop();
            }
            else if(op == 3){
                peek();
            }
        }

        display();
        scanner.close();
    }
}
