package _01IntroStringClass;

public class _04stringLengthCharacterCombining {
    public static void main(String[] args) {
        /*
        The String class provides the methods for obtaining a String's length,
        retrieving individual character and concatenating string.
        */

        // • length()
        String str = "tesla";
        System.out.println(str.length()); // 5

        // • charAt()
        /*
        charAt() method can be used to retrieve a specific character in a string
        where index is between 0 to str.length() - 1. 
        */
        System.out.println(str.charAt(3)); // l

        // • concat()
        String str1 = "Nikola";
        System.out.println(str1.concat(str)); // Nikolatesla
        /*
        '+' operator can also be used to concatenating string.
        */
        System.out.println(str1 + " " + str); // Nikola tesla
    }
    
}
