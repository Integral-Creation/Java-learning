package _05LinkedList.DoublyLinkedList;

public class _03DoublyLLInsertAtPos {
    static class Node{
        int data;
        Node next, prev;

        Node(int data){
            this.data = data;
        }
    }

    private Node head;

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // Insert at first
    public void insertFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(isEmpty()){
            head = newNode;
            return;
        }

        head.prev = newNode;
        head = newNode;
    }

    // Insert at last
    public void insertLast(int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(isEmpty()){
            newNode.prev = null;
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    // Size
    public int size(){
        Node current = head;
        int count = 0;

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    // Inset at Position
    public void insertAtPos(int data, int pos){
        int len = size();
        Node newNode = new Node(data);

        // Invalid Position
        if(pos < 1 || pos > len + 1){
            System.out.println("Invalid Position");
            return;
        }

        // if pos == 1
        if(pos == 1){
            insertFirst(data);
            return;
        }

        // if pos == len + 1
        if(pos == len + 1){
            insertLast(data);
            return;
        }

        // insert at position
        Node current = head;
        
        int i = 1; // flag
        while(i < pos - 1){
            current = current.next;
            i++;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if(current.next != null){
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    // Display
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty nothing to display");
            return;
        }

        Node current = head;

        System.out.println("Forward traversal");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        current = head;
        while(current.next != null){
            current = current.next;
        }
        
        System.out.println();
        System.out.println("Reverse traversal");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        _03DoublyLLInsertAtPos list = new _03DoublyLLInsertAtPos();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.display();

        System.out.println();

        list.insertAtPos(66, 3);
        list.display();
    }
}
