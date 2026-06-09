import java.util.Scanner;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5 ; i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 5){
                System.out.println("Times up!");
                System.exit(0);
            }
        }
    }
}

public class _03caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        
        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
