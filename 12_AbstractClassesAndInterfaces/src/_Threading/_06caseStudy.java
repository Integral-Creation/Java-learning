class NumberTask implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){
                System.out.println("Something went Wrong");
            }
        }
    } 
}

class LetterTask implements Runnable{
    @Override
    public void run(){
        for(char i = 'A'; i <= 'E'; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){
                System.out.println("Something went Wrong");
            }
        }
    } 
}

public class _06caseStudy {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new NumberTask());
        Thread t2 = new Thread(new LetterTask());

        t1.start();
        t2.start();
    }
}
