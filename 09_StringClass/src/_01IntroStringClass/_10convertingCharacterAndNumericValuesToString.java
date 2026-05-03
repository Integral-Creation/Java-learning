package _01IntroStringClass;

public class _10convertingCharacterAndNumericValuesToString {
    public static void main(String[] args) {
        /*
        Following method that can be used to convert a character and numeric values to strings with different parameter types char, double, int and float.
        */
        // • valueOf(c: char) : String -> returns a string consisting  of the character c
        // • valueOf(data: char[]) : String -> returns a string consisting  of the character in array.
        // • valueOf(d: double) : String -> returns a string representing the double value
        // • valueOf(i: int) : String -> returns a string representing the int value
        // • valueOf(l: long) : String -> returns a string representing the long value
        // • valueOf(f: float): String -> returns a string representing the float value
        // • valueOf(b: boolean): String -> returns a string representing the boolean value

        String str = String.valueOf(new char[]{'j','a','v','a'});
        System.out.println(str); // java
    }
}
