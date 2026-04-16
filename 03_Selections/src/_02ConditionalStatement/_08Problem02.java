package _02ConditionalStatement;

public class _08Problem02 {
    public static void main(String[] args) {
        int count = 45;
        /*
        boolean newLine;
        if(count % 10 == 0){
            newLine = true;
        }
        else{
            newLine = false;
        }
        */
        boolean newLine = count % 10 == 0;
        System.out.println(newLine);
    }
}
