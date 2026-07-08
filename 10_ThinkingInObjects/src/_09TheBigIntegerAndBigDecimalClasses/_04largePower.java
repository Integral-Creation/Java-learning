import java.util.Scanner;
import java.math.BigInteger;

public class _04largePower{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number");
        BigInteger n = scanner.nextBigInteger();
        System.out.print("Enter power number");
        int p = scanner.nextInt();
        
        System.out.println("Result: " + n.pow(p));
        
        scanner.close();
    }
}