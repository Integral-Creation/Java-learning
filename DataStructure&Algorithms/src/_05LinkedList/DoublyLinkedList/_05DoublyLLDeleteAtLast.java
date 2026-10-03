package _05LinkedList.DoublyLinkedList;

public class _05DoublyLLDeleteAtLast {
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
        _05DoublyLLDeleteAtLast list = new _05DoublyLLDeleteAtLast();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        list.display();

        list.deleteLast();
        list.display();
    }
}
