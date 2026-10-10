package _05LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class _08Practical {
    static class Node{
        int data;
        Node next;
    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            // insertFirst(data);
            head = newNode;
            return;
        }

        // Traverse at the last node
        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        // connect the last node to the newNode
        current.next = newNode;
    }

    public int size(){
        Node current = head;
        int count = 0;

        while(current.next != null){
            count++;
            current = current.next;
        }

        return count;
    }

    public int middle(){
        Node current = head;
        for(int i = 0; i < size()/2; i++){
            current = current.next;
        }

        return current.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to display!");
            return;
        }

        System.out.print("List is: ");
        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        _08Practical list = new _08Practical();
        list.insertLast(10);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int val = scanner.nextInt();
            list.insertLast(val);
        }
        System.out.println(list.middle());
        scanner.close();
    }
}
