package _08WrapperClasses;
/*
Wrapper classes:
    • A Wrapper Class is a class that converts a primitive data type into an object.
    • Allow primitive values (int, char, double, boolean) to be used as objects.
    • "wrap them in a object" Generally, don't warp primitive unless you need an object.
    Allow use of collection framework and static Utility Methods...
*/
public class _01wrapperClass {
    public static void main(String[] args) {

        // Since Java 9, these constructors have been deprecated and should not be used.
        /*
            Integer a = new Integer(123);
            Double b = new Double(3.14);
            Character c = new Character('c');
            Boolean d = new Boolean(true);
        */
        
        // Auto-boxing -> Automatic conversion of a primitive into its wrapper object.
        Integer a = 123;
        Double b = 3.14;
        Character c = 'c';
        Boolean d = true;
        String e = "Tesla";

        // Un-boxing -> Automatic conversion of a wrapper object into a primitive.
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;
        String p = e;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(p);

        String f = Integer.toString(123);
        String g = Double.toString(3.14);
        String h = Character.toString('@');
        String i = Boolean.toString(true);

        String q = f + g + h + i;

        System.out.println(q);

        
    }
    
}
