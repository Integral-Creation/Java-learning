package _05LinkedList.DoublyLinkedList;

public class _06DoublyLLDeleteAtPos {
    static class Node{
        int data;
        Node next, prev;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;

    // IsEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // InsertFirst
    public void insertFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(!isEmpty()){
            head.prev = newNode;
        }

        head = newNode;
    }

    // delete first
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("Nothing in the list (Underflow)");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // deletion at last
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.prev.next = null;
    }

    public int size(){
        Node current = head;
        int count = 0;

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    // delete at Pos
    public void deleteAtPos(int pos){
        int len = size();
        
        if(pos < 1 || pos > len){
            System.out.println("Invalid position");
            return;
        }
        
        if(pos == 1){
            deleteFirst();
            return;
        }
        
        if(pos == len){
            deleteLast();
            return;
        }
        
        Node current = head;
        int i = 1;
        while(i < pos){
            current = current.next;
            i++;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // Display
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty Nothing to display");
            return;
        }

        Node current = head;
        System.out.println("Forward traversal");

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
        System.out.println("Reverse traversal");

        current = head;
        while(current.next != null){
            current = current.next;
        }

        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        _06DoublyLLDeleteAtPos list = new _06DoublyLLDeleteAtPos();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        list.display();

        list.deleteAtPos(3);
        list.display();
    }
}
