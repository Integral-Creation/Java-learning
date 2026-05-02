package _01IntroStringClass;

public class _05substring {
    public static void main(String[] args) {
        /*
        substring
            In java, the substring() method in String class returns a sub string from a giving string.
                • substring(beginIndex: int) : String -> returns the string that begins from the given 
                index and extend to the end of the string.
                • substring(beginIndex: int, endIndex: int) : String -> returns the string that begins 
                from beginIndex and extended to the endIndex.
        */
       String str = "Welcome to Java";
       System.out.println(str.substring(5));

       System.out.println(str.substring(5,10));
    }
}
