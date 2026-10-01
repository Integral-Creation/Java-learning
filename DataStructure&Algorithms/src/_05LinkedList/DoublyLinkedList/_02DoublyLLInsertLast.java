package _05LinkedList.DoublyLinkedList;

public class _02DoublyLLInsertLast {
    static class Node{
        int data;
        Node next, prev;

        Node(int data){
            this.data = data;
        }
    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
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
        // traverse at the end
        while(current.next != null){
            current = current.next;
        }
    
        current.next = newNode; // connect last node to the newNode
        newNode.prev = current; // connect newNode prev to the current
    }

    // display
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.println("Forward traversal");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        current = head;
        System.out.println();
        System.out.println("Reverse traversal");
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
        _02DoublyLLInsertLast list = new _02DoublyLLInsertLast();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.display();
    }
}
