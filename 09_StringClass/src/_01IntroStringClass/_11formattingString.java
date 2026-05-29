package _01IntroStringClass;

public class _11formattingString {
    public static void main(String[] args) {
        /*
        String class contains a static format method to create a formatted string.
                syntax:
                    String.format(format , item1, item2, ... item);
        */
        String str = "welcome";
        String name = "Tesla";
        
        System.out.println(String.format("|%-10s %10s|",str,name)); // |welcome         Tesla|
    }
}
