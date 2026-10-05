package _05LinkedList.SinglyLinkedList;

public class _03LinkedListInsertAtGivenPosition {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;

    public boolean isEmpty(){
        return  head == null;
    }

    // Insert at first
    public void insertFirst(int data){
        Node newNode = new Node(data);
        
        if(isEmpty()){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert at last
    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            insertFirst(data);
            return;
        }

        Node current = head; // created a temp variable that points to the head
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert at a given position
    public void insertAtGivenPos(int data, int pos){
        Node newNode = new Node(data);

        
        // Invalid position
        if(pos < 1){
            System.out.println("Invalid Position");
            return;
        }
        
        // Position at first
        if(pos == 1){
            newNode.next = head; // point the next reference variable of newNode to the head
            head = newNode; // move head to newNode
            return;
        }

        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        // Insert at Specific position
        Node current = head; // created a temp variable that points to the head

        // traverse till the (pos - 1) node
        for(int i = 1; i < pos - 1; i++){
            if(current.next == null){
                System.out.println("Position out of range");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to display");
            return;
        }

        Node curr = head;
        System.out.print("List: ");
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        _03LinkedListInsertAtGivenPosition list = new _03LinkedListInsertAtGivenPosition();
        
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(40);
        list.insertLast(50);

        list.display();

        list.insertAtGivenPos(2000, 3);
        list.display();

        list.insertAtGivenPos(7, 7);
    }
}
