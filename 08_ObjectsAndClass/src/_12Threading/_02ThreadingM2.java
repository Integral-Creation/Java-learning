package _12Threading;

class MyThread02 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running Successfully");
    }
}
public class _02ThreadingM2 {
    public static void main(String[] args) {
        MyThread02 thread = new MyThread02();

        // Initializing the new Thread object
        Thread t1 = new Thread(thread);

        t1.start();
    }
}
