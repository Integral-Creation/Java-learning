package _02Stack;
import java.util.Scanner;

public class _02StackImplementationUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;

    // push()
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void pop(){
        if(isEmpty()){
            return;
        }

        head = head.next;
    }

    public void peek(){
        if(isEmpty()){
            return;
        }

        System.out.println(head.data);
    }

    // isEmpty()
    public boolean isEmpty(){
        return head == null;
    }

    // display
    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to display");
            return;
        }

        Node current = head;
        while(current!= null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        _02StackImplementationUsingLL list = new _02StackImplementationUsingLL();

        Scanner scanner = new Scanner(System.in);
        /*
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int op = scanner.nextInt();

            if(op == 1){
                int data = scanner.nextInt();
                list.push(data);
            }
            else if(op == 2){
                // list.pop();
            }
            else if(op == 3){
                // list.peek();
            }
        }
        */

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        list.display();

        list.pop();

        list.display();

        list.peek();
        scanner.close();
    }
}
