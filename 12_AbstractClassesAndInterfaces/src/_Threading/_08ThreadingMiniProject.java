/*
Create a simple simulation with 3 threads:

Download Thread → prints "Downloading..."
Process Thread → prints "Processing..."
Save Thread → prints "Saving..."

Requirements:

Download must finish before Process starts.
Process must finish before Save starts.
Use join() to enforce the order.
*/

class Download implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Downloading...");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Downloading Interrupted");
        }
    }
}
class Process implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Processing...");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Processing Interrupted");
        }
    }
}
class Save implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Saving...");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Saving Interrupted");
        }
    }
}

public class _08ThreadingMiniProject {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new Download());
        Thread processThread = new Thread(new Process());
        Thread saveThread = new Thread(new Save());

        try{
            downloadThread.start();
            downloadThread.join();
            System.out.println("Download complete");
            System.out.println();
            
            processThread.start();
            processThread.join();
            System.out.println("Processing complete");
            System.out.println();
            
            saveThread.start();
            saveThread.join();
            System.out.println("Saving complete");
        }catch(InterruptedException e){
            System.out.println("Something went wrong");
        }
    }
}
