package _05LinkedList.DoublyLinkedList;

public class _01DoublyLLInsertAtFirst{
    class Node{
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

    // Insert At first
    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(!isEmpty()){
            head.prev = newNode;
        }

        head = newNode;
    }

    // Display
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Forward Traversal: ");

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        System.out.print("Reverse Traversal: ");

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
        _01DoublyLLInsertAtFirst list = new _01DoublyLLInsertAtFirst();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);

        list.display();
    }

}
