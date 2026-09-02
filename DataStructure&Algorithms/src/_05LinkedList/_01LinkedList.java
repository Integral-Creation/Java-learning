package _05LinkedList;

import java.util.LinkedList;

/*
    Linked List
        A linked list is a linear data structure where elements are stored as nodes. Unlike an array, element are stored in a contiguous memory location.
        each nodes represents
            • Data -> actual data value
            • Reference(link or address) -> points to the next node

    representation
        Head
          ↓
        [D1 | A1] → [D2 | A2] → [D3 | null] → null


*/

public class _01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");

        System.out.println(linkedList); // [E, D, C, B, A]
    } 
}
