package _05LinkedList.CircularLinkedList;

public class _01CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;

            newNode.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    public void display(){
        if(isEmpty()){
            return;
        }

        Node current = head;

        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != head);

        System.out.println();
    }

    public void deleteAtEnd(){
        if(isEmpty()){
            return;
        }

        // if only one node
        if(head == tail){
            head = null;
            tail = null;

            return;
        }

        Node current = head;
        while(current.next != tail){
            current = current.next;
        }

        tail = current;
        current.next = head;
    }

    public static void main(String[] args) {
        _01CircularLinkedList list = new _01CircularLinkedList();

        list.insert(10);
        list.insert(10);
        list.insert(10);
        list.insert(20);

        list.display();

    }
}
