package javaProgrammingExercises01;

public class Display02 {
    public static void main(String[] args){
        int a = 5;
        for(int i = 1;i<=4;i++){
            /*
            System.out.print(i);
            System.out.print(" "+i*2);
            System.out.print(" "+i*3);
            System.out.print("\n");
            */
            System.out.printf("%d %d %d\n", i, i*2, i*3);
        }
    }
}
