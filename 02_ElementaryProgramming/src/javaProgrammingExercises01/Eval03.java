package javaProgrammingExercises01;

public class Eval03 {
    public static void main(String[] args){
        double ans=0.0;
        for(int i = 1;i<=6;i++){
            double temp;
            temp = (double) 1 /(2*i-1);
            if(i%2!=0){
                ans+=temp;
            }
            else{
                ans-=temp;
            }
        }
        System.out.println("ans:"+ans*4);
        System.out.printf("%.2f", ans*4);
    }
}
