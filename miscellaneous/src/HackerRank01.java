import java.util.Scanner;

public class HackerRank01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            int input = scanner.nextInt();

            if(input > 0){
                count++;
                if(count > max){
                    max = count;
                }
            } else {
                count =0;
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
