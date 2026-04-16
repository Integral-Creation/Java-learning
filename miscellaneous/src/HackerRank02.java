import java.util.Scanner;

public class HackerRank02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0, temp = 0;
        for(int i = 0;i < n;i++){
            int j = scanner.nextInt();
            temp += j;
            if(temp > t){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
