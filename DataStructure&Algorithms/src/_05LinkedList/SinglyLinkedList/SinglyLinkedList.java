package _05LinkedList.SinglyLinkedList;

/*
    Singly LinkedList
        Singly LinkedList is a linear data structure where each elements nodes stores:
            • Data
            • Reference to the next Node

        while implementation of a SLL we need to always maintain a reference to the head to the LinkedList and a reference to the tail Node for Quick Additions and Removals.

    SLL representations:
            `Head`               `Node`             `Tail`
        [data | address] -> [data | address] -> [data | null]
*/


public class SinglyLinkedList {
    
/* Node Class
        Node is a Basic data structure which contains data and one or more links to other Nodes.
*/    
    private Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

/** Insert at beginning */
    public void InsertFirst(int data){
    // Allocate the newNode and put the data
        Node newNode = new Node(data);

    // Make next of newNode as head
        newNode.next = head;
    // Move head to point to newNode
        head = newNode;
    }

/** Insert at the end */
    public void InsertLast(int data){
    // Allocate the newNode and put the data
        Node newNode = new Node(data);

    // If Linked List is empty then make a newNode as head
        if(head == null){
            head = newNode;
            return;
        }
        
    // Else traverse till the Last node
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

        return;
    }

/** Print Linked List */
    public void display(){
        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLL = new SinglyLinkedList();
        
        singlyLL.InsertFirst(10);
        singlyLL.InsertFirst(20);
        singlyLL.InsertFirst(30);
        singlyLL.InsertLast(60);
        singlyLL.InsertLast(70);
        singlyLL.InsertFirst(40);
        singlyLL.InsertFirst(50);

        singlyLL.display(); // 50 -> 40 -> 30 -> 20 -> 10 -> 60 -> 70 -> null


    }
}
