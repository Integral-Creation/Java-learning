package _04PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    Priority Queue 
        A Priority Queue in java is a queue in which elements are placed based on their priority, not simply on the order in which they are inserted.
        • Follows FIFO principle
        • It uses the Heap data structure internally to ensure efficient insertion or removal of highest priority elements.

    Priority Queue Method
        | Method     | Description                                              |
        | ---------- | -------------------------------------------------------- |
        | `add()`    | Adds an element                                          |
        | `offer()`  | Adds an element                                          |
        | `poll()`   | Removes and returns the highest-priority element         |
        | `peek()`   | Returns the highest-priority element without removing it |
        | `remove()` | Removes an element                                       |
        | `size()`   | Returns the number of elements                           |


*/
public class _01PriorityQueue {
    public static void main(String[] args) {
        /** implementing PriorityQueue */
        Queue<Double> queue = new PriorityQueue<>();

        /**  Queue Method*/
    // Enqueueing - offer()
        queue.offer(2.4);
        queue.offer(1.4);
        queue.offer(4.6);
        queue.offer(2.9);
        queue.offer(4.9);

        System.out.println(queue); // [1.4, 2.4, 4.6, 2.9, 4.9]
/* By default Priority Queue is mini-heap thus, the smallest element has the highest priority.*/

        /** Iterating the PriorityQueue */
        Iterator<Double> iterator = queue.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " "); // 1.4 2.4 4.6 2.9 4.9
        }
    }
}
