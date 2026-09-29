package _05LinkedList.SinglyLinkedList;

public class _02LinkedListInsertAtLast {
    static class Node{
        int data;
        Node next;
    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();

        newNode.data = data;
        newNode.next = head; // newNode points to the head
        head = newNode; // move the head to the newNode
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

    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to display!");
            return;
        }

        Node curr = head;
        System.out.print("List is: ");
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        _02LinkedListInsertAtLast list = new _02LinkedListInsertAtLast();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(40);
        list.insertLast(50);

        list.display();
    }
}
