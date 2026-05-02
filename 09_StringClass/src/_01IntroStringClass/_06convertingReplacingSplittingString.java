package _01IntroStringClass;

public class _06convertingReplacingSplittingString {
    public static void main(String[] args) {
        /*
        String class provide following methods to convert, replacing and splitting string.
        */
       String str = "Welcome to java";
       
        // • toLowerCase() : String -> convert the string to lower case
        System.out.println(str.toLowerCase()); // welcome to java

        // • toUpperCase() : String -> convert the string to Upper case
        System.out.println(str.toUpperCase()); // WELCOME TO JAVA

        // • trim() : string -> returns a new string with all white space character trimmed both side
        System.out.println(str.trim());

        // • replace(oldChar: char, newChar: char) : String -> returns the string that replace the first matching character in the string.
        System.out.println(str.replace("java", "Tesla")); // Welcome to Tesla
        
        // • replaceAll(oldChar: char, newChar: char) : String -> returns the string that replace the all matching character in the string.
        System.out.println(str.replaceAll("e", "E")); // WElcomE to java
       
        // • split(delimeter: String) : String[] -> retruns an arrays of string consisting of the substring split by the delimeter
        String str1 = "Java#Git#EnderDragon";
        String[] tokens = str1.split("#");
       
        for(int i = 0; i < tokens.length ; i++)
            System.out.println(tokens[i]+" ");
        /*
        Java 
        Git 
        EnderDragon
        */
    }
}
