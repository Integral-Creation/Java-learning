import java.util.Scanner;

public class HackerRank03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
