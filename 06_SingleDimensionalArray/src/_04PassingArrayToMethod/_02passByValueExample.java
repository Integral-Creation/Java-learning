package _04PassingArrayToMethod;

public class _02passByValueExample {
    public static void m(int num , int[] numArr){
        num = 100; // assign a new value to a number
        numArr[0] = 55; // assign a new value to numArr[0]

    }
    public static void main(String[] args){
        int x = 1;
        int[] y = new int[10];

        m(x,y);
        System.out.println("x is: "+x); // output -> 1 
        System.out.println("y[0] is : "+y[0]); // output -> 55
        /*
        here output remains 1 even after the method m is invoked, but y[0] is changed to 55.

        For an argument of an array type, the value of the argument is the reference to the array.
        so any changes inside the method will be reflected in the reference array.

        For an argument of primitive type, the argument's value is passed.
        
        Array are objects in java. the JVM stores the objects in an area of memory called heap, which is used for dynamic memory allocation.

        */
    }
}
