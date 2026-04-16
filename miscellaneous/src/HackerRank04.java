import java.util.Scanner;

public class HackerRank04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            int height = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int day = 0;
            int climb = 0;
            for( ;climb <= height; ){
                day++;
                climb += x;
                if(climb == height){
                    break;
                }
                climb -= y;
            }
            System.out.println(day);

        }

        scanner.close();
    }
}
