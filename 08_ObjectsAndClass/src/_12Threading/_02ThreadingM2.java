package _12Threading;

class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running Successfully");
    }
}
public class _02ThreadingM2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // Initializing the new Thread object
        Thread t1 = new Thread(thread);

        t1.start();
    }
}
