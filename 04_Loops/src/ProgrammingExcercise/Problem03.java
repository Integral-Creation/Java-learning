package ProgrammingExcercise;

public class Problem03 {
    public static void main(String[] args) {
        System.out.println(" kilogram      gram");
        System.out.println("-----------------------");
        for(int i = 1; i <= 25; i++){
            System.out.printf("   %2d       %6d",i,i*1000);
            System.out.println();
        }
    }
}
