package _04PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class _02PriorityQueue {
    public static void main(String[] args) {
        /** implementing PriorityQueue using Collections.reverseOrder() */
        Queue<Double> queueII = new PriorityQueue<>(Collections.reverseOrder());
            // Enqueueing
        queueII.offer(2.4);
        queueII.offer(1.4);
        queueII.offer(4.6);
        queueII.offer(2.9);
        queueII.offer(4.9);

        System.out.println(queueII); // [4.9, 4.6, 2.4, 1.4, 2.9]
    }
}
