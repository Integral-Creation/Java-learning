package _01IntroStringClass;

public class _02ImmutableString {
    public static void main(String[] args) {
        /*
        A String object is immutable; it's content cannot be changed.
        */
       String a = "hello";
       String b = "hello";

       System.out.println(a == b); // output: true • same object in pool
       System.out.println(a.equals(b)); // output: true • same content

       String c = new String("hello");
       System.out.println(a == c); // output: false • different objects
       System.out.println(a.equals(c)); // output: true • same content

       /*
        Because string are immutable and ubiquitous in programming, the JVM uses
        unique instance for string literals with same character sequence in order 
        to save memory. Such an instance is called an Interned String.

        here, both a and b refers to the same interned string "hello" so, a == b is true.
        however a == c is false, because a and b are different string objects, even though 
        they have same contents. 
       */
    }
}
