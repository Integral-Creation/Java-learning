package _01IntroStringClass;

public class _09conversionBtwStringsAndArrays {
    public static void main(String[] args) {
        /*
        Strings are not arrays but can be converted into arrays or vice-versa.

        • toCharArray() -> to convert string into array of character
                syntax:
                    char[] chars = "String".toCharArray();
        */
        char[] chars = "Java".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " "); // J a v a 
        }
        
        /*
        • String(char[]) -> to convert array to string use String(char[]) constructor
            syntax:
                String str = new String(char[]);
        */
        
        String str = new String(chars);
        System.out.println(str); // Java
    }
}
