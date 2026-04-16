public class _03PassingParameter {
    public static void printString(String message, int n){
        for(int i = 0; i<n; i++){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        printString("hello java!", 5);
    }
}
