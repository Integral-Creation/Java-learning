package _01IntroStringClass;

public class _08findingCharacterOrSubstring {
    public static void main(String[] args) {
        /*
        String class provide several methods to find the character or a substring in a string:
        */

        String str = "welcome";
        // • indexOf(ch: char) : int -> returns the index of first occurrence of ch in the String
        System.out.println(str.indexOf('w')); // 0

        // • indexOf(ch: char, fromIndex: int) : int -> returns index of first occurrence of ch after fromIndex in a string
        System.out.println(str.indexOf('e', 3)); // 6

        // • indexOf(str: String) : int -> returns the index of first occurrence of str(String) in the String
        System.out.println(str.indexOf("come")); // 3

        // • indexOf(str: String, fromIndex: int) : int -> returns index of first occurrence of str(String) after fromIndex in a string
        System.out.println(str.indexOf("come", 5)); // -1

        // • lastIndexOf(ch: char) : int -> returns the last occurrence of the ch in a string
        System.out.println(str.lastIndexOf('o')); // 4

        // • lastIndexOf(ch: char, fromIndex: int) : int -> returns index of first occurrence of ch after fromIndex in a string
        System.out.println(str.lastIndexOf('l',3)); // 2 

        // • lastIndexOf(str: String) : int -> returns the last occurrence of the ch in a string
        System.out.println(str.lastIndexOf("come")); // 3
        
        // • lastIndexOf(str: String, fromIndex: int) : int -> returns index of first occurrence of ch after fromIndex in a string
        System.out.println(str.lastIndexOf("wel",0)); // 0
    }
}
