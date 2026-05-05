package _04StringBuilderAndStringBufferClasses;

public class _02ObtainingPropertiesString {
    public static void main(String[] args) {
        /*
        StringBuilder provides additional methods for string builder for manipulation and obtaining its properties.

        • toString(): String
        • capacity(): int
        • charAt(index: int): char
        • length(): int
        • setLength(newLength: int); void
        • substring(StartIndex: int): String
        • substring(StartIndex: int, endIndex: int): String
        • trimToSize(): void
        */

        /*tostring()*/
        StringBuilder sb = new StringBuilder("hello");
        String str = sb.toString();
        System.out.println(str); // hello

        /*capacity()*/
        System.out.println(sb.capacity()); // 21

        /*charAt()*/
        System.out.println(sb.charAt(2)); // l

        /*length*/
        System.out.println(sb.length()); // 5

        /*setLength()*/
        sb.setLength(6);
        System.out.println(sb); // hello'\0'

        /*substring()*/
        String str1 = sb.substring(2);
        System.out.println(str1); // llo

        String str2 = sb.substring(1,4);
        System.out.println(str2); // ell

        /*trimToSize()*/
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("hello world");
        
        System.out.println(sb2.capacity()); // 50
        sb2.trimToSize();
        System.out.println(sb2.capacity()); // 11
    }
}
