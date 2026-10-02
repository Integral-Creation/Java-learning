package _05LinkedList.DoublyLinkedList;

public class _04DoublyLLDeleteAtFirst {
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

    // insertFirst
    public void insertFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(!isEmpty()){
            head.prev = newNode;
        }

        head = newNode;
    }

    // insertLast
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

    // delete at first
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
        _04DoublyLLDeleteAtFirst list = new _04DoublyLLDeleteAtFirst();

        list.insertFirst(10);
        list.insertFirst(10);
        list.insertFirst(10);
        list.insertFirst(10);
        list.insertFirst(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(20);

        list.display();

        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();

        list.display();
    }
}
