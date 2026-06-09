package _12Threading;

/*
MultiThreading:
    Enables a program to run multiple threads concurrently
    (Thread -> A set of instruction that run independently)
    Useful for background tasks or time-consuming operations
*/

class MyRunnableGlobal implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println( Thread.currentThread().getName() + " " + i);
            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted");
            }
        }
    }
}
public class _04MultiThreading {
    public static void main(String[] args) {


        Thread thread1 = new Thread(new MyRunnableGlobal());
        Thread thread2 = new Thread(new MyRunnableGlobal());
        thread1.start();
        thread2.start();
    }
}
