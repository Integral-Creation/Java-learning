import java.util.ArrayList;
import java.util.Scanner;

public class _04caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the no of foods you would like: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            System.out.print("Enter food #" + i + ": ");
            foods.add(scanner.nextLine());
        }

        System.out.println(foods);
        scanner.close();

        /*
        Enter the no of foods you would like: 3
        Enter food #0: rice
        Enter food #1: rotti
        Enter food #2: dal
        [rice, rotti, dal]
        */
    }
}
