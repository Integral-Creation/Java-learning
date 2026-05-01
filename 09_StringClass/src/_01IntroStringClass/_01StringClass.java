package _01IntroStringClass;

public class _01StringClass {
    public static void main(String[] args) {
        /*
        String:
            It's a sequence of character or an array of characters.
            In java String is treated as object.
        
            • A string is an immutable. It's content cannot be changed once the string is created.
        */

        /*
        Constructing a String
            Syntax: 
                String newString = new String(StringLiteral);
        */
        String message = new String("Hello World");
        System.out.println(message);
        
        // String from an array of character
        char[] charArray = {'T', 'e', 's', 'l', 'a'};
        System.out.println(charArray); 
    }
    
}
