package _05LinkedList.SinglyLinkedList;

public class _06LinkedListDeleteAtGivenPos {
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

    // Insert at Beginning 
    public void insertFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at Last
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

    // public insert at given position
    public void insertAtGivenPos(int pos, int data){
        Node newNode = new Node(data);

        // if pos < 1
        if(pos < 1){
            System.out.println("Position cannot be negative or 0");
            return;
        }

        // if pos == 1
        if(pos == 1){
            insertFirst(data);
            return;
        }

        // if empty
        if(isEmpty()){
            System.out.println("List is empty");
        }

        Node current = head;

        for(int i = 0; i < pos - 1; i++){
            if(current.next == null){
                System.out.println("Position out of range");
                return;
            }

            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // delete at beginning
    public void deleteAtFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }else{
            int temp = head.data;

            System.out.println("data Delete is: " + temp);
            head = head.next;
        }
    }

    // Delete at last
    public void deleteAtLast(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
    }

    // Delete at given Position
    public void deleteAtGivenPos(int pos){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        
        if(pos < 1){
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1){
            head = head.next;
            return;
        }

        Node current = head;
        Node temp = head;
        int count = 1;

        while(count < pos - 1 && current != null){
            current = current.next;
            count++;
        }

        if(current == null || current.next == null){
            System.out.println("Position out of range");
            return;
        }

        temp = current.next;
        current.next = temp.next;
    }

    // Display
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");   
            currNode = currNode.next;
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        _06LinkedListDeleteAtGivenPos list = new _06LinkedListDeleteAtGivenPos();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();

        list.deleteAtGivenPos(3);

        list.display();
    }
}