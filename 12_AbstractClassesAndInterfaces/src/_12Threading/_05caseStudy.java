package _12Threading;

class MyRunnableNewGlobal implements Runnable{

    private final String text;

    MyRunnableNewGlobal(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted");
            }
        }
    }
}
public class _05caseStudy {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnableNewGlobal("PING"));
        Thread thread2 = new Thread(new MyRunnableNewGlobal("PONG"));

        System.out.println("GAME START");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("Thread is Interrupted");
        }
        System.out.println("GAME OVER");
    }
}
