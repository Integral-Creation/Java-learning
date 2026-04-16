package _04ForLoop;

public class _01ForLoop {
    public static void main(String[] args) {
        /*
        for loop is used when we know the number of iteration
        syntax:
            for(initialization; loop continuation condition ; increment or decrement){
                statement;
            }


            for( ; ; ) ===== for( ;true; ) ==== while( true ) -> if the loop condition is imitted then it is
            implicitly true; which can lead to infinite loop;
         */

        for(int i = 0; i < 5; i++){
            System.out.println("welcome to java");
        }
//        for(int i = 1; i < 10; System.out.println(i),i++);
        int a = 1;
        do{
            System.out.println(a++);
        } while(a < 10);

    }
}
