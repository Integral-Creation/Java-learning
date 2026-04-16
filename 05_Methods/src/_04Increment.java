public class _04Increment {
    public static void increment(int n){
        n++;
        System.out.println("n is inside the method is: "+n);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("before the call value of a is: "+a);
        increment(a);
        System.out.println("after the call value of a is: "+a);

        /*

         */
    }
}
