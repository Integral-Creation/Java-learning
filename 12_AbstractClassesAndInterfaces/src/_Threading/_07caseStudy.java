class MyRunnableUNIVERSAL implements Runnable{
    @Override
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread is Interrupted");
        }
    }
}

public class _07caseStudy {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableUNIVERSAL());

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Blast Off!");
    }
}
