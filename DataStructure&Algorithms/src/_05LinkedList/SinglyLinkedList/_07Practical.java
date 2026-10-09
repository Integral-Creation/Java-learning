package _05LinkedList.SinglyLinkedList;
import java.util.Scanner;

public class _07Practical {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    
    private Node head;

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // insert at the end
    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    // Delete the data
    public void delete(int data){
        if(isEmpty()){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if(current.next == null){
            return;
        }

        current.next = current.next.next;
    }

    // Display
    public void display(){
        if(isEmpty()){
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        _07Practical list = new _07Practical();

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int op = scanner.nextInt();
            if(op == 1){
                int data = scanner.nextInt();
                list.insertLast(data);
            }
            else if(op == 2){
                int data = scanner.nextInt();
                list.delete(data);
            }
        }

        list.display();
        
        scanner.close();
    }
}
