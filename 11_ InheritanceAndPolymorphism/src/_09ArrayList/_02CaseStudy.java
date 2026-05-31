import java.util.Scanner;
import java.util.ArrayList;

public class _02CaseStudy{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] >= 0 ){
                temp.add(arr[i]);
            }
        }
        
        if(temp.size() != 0){
            double sum = 0;
            for(int i = 0; i < temp.size(); i++){
                sum += temp.get(i);
            }
        
            System.out.println((sum)/temp.size());
        }else{
            System.out.println(0.0);
        }
        
        scanner.close();
    }
}
