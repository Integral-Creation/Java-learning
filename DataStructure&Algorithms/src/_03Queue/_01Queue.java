package _03Queue;
import java.util.Queue;
import java.util.LinkedList;

/*
    Queue
        A Queue is a linear data structure that follows:
            `FIFO (First IN First OUT)`.
                
    Queue Operation
        | Operation   | Description                                   |
        | ----------- | --------------------------------------------- |
        | `offer()`   | Adds an element to the rear                   |
        | `poll()`    | Removes and returns the front element         |
        | `peek()`    | Returns the front element without removing it |
        | `isEmpty()` | Checks whether the queue is empty             |
        | `size()`    | Returns size of a queue                       |
        | `contains()`| Returns boolean if element present in a queue |

*/
public class _01Queue {
    public static void main(String[] args) {
        /** implementing Queue */
        /** A Queue is an interface, so we need to implement using the LinkedList, PriorityQueue or ArrayQueue (`Linear Data Structure`) */
        Queue<String> queue = new LinkedList<>();

        /**  Queue Method*/
    // Enqueueing - offer()
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue); // [A, B, C, D]
        
    // Dequeuing - poll()
        queue.poll();
        System.out.println(queue); // [B, C, D]

    // peek()
        System.out.println(queue.peek()); // B

    // isEmpty()
        System.out.println(queue.isEmpty()); // false
    
    // size()
        System.out.println(queue.size()); // 3
    
    // contains()
        System.out.println(queue.contains("D")); // true
    }
}
