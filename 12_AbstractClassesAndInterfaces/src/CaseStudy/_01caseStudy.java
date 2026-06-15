import java.util.Scanner;

interface Camera{
    default void boat(){
        System.out.println("Camera booting...");
    }
}

interface Microphone{
    default void boat(){
        System.out.println("Microphone booting...");
    }
}

class SmartDisplay implements Camera, Microphone{
    @Override
    public void boat(){
        Camera.super.boat();
        Microphone.super.boat();

        System.out.println("System ready.");
    }
}
public class _01caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int n = scanner.nextInt();

        SmartDisplay s = new SmartDisplay();
        for(int i = 0; i < n; i++){
            s.boat();
        }
        scanner.close();
    }
}
