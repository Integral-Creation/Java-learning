package _12Threading;
/*
Threading:
    Allows a program to run multiple tasks simultaneously 
    Helps improve performance with time-consuming operations
    (File I/O, network communication, or any background tasks)

    Creating a thread
        • Method 1: Extending the thread class
        • Method 2: Implement the Runnable interface
*/

/**Method 1 */
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class _01ThreadingM1{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Thread is running...
        /*
        Here, start() method internally call run() in a new thread
        */
    }
}