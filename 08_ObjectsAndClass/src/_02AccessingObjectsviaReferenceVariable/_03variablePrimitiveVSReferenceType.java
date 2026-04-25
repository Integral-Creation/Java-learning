public class _03variablePrimitiveVSReferenceType {
    /*
    Every variable represents a memory location that holds a value;
        Primitive type variable:
            • Stores actual value
            • Stores in a Stack memory
            • faster access
        
        Reference Types Variable:
            • Stores the Address of an object.
            • Reference variable stores in a Stack.
            • Actual object stores in Heap.

    */
    public static void main(String[] args) {
        // Variable of Primitive Types
        int i = 1; // i -> 1 here, value 1 assign to variable i;

        // Variable of Reference Type
        circle c1 = new circle(); // c1 stores the address of a circle object, and that object has a field radius

        // Primitive type assignment
        int j = 2;
            // before assignment
        System.out.println("value of i: "+i);
        System.out.println("value of j: "+j);

        i = j;
            // after assignment
        System.out.println("value of i: "+i);
        System.out.println("value of j: "+j);

        /*
        here, i gets a copy of value from j
        After assignment, both hold 2, but they are independent variables
        */

        // Reference type assignment:
        circle c2 = new circle();

        c1.radius = 1;
        c2.radius = 2;

            // before assignment
        System.out.println(c1.radius);
        System.out.println(c2.radius);
        c1 = c2;

            // after assigment
        System.out.println(c1.radius);
        System.out.println(c2.radius);

        /*
        here, the assigement statement c1 = c2 copies the refernece of c2 into c1 for reference variables, after assignemnt variable c1 and c2 refers to the same objects.
        */

    }
}

class circle{
    int radius = 1;

    void getArea(){
        System.out.println(Math.PI * radius * radius);
    }
}