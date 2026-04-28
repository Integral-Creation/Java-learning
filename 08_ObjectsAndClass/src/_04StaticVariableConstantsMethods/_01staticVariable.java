package _04StaticVariableConstantsMethods;

/*
A static variable is shared by all objects at the class level.
*/

class circleWithStaticMembers{
    double radius;

    // • Static variable
    static int numberOfObjects = 0;

    // • Instance method
    circleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }

    circleWithStaticMembers(double radius){
        this.radius = radius;
        numberOfObjects++;
    }

    // • Static method
    static int getNumberOfObjects(){ // return numberOfObjects
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

}
public class _01staticVariable {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of cricle objects is " + circleWithStaticMembers.numberOfObjects);

        // create a circle1
        circleWithStaticMembers circle1 = new circleWithStaticMembers();

        // display circle1
        System.out.println("\nAfter creating circle1");
        System.out.println("circle1 radius (" + circle1.radius + ") and the number of the circle objects (" + circleWithStaticMembers.numberOfObjects + ")");
        
        // create a circle2
        circleWithStaticMembers circle2 = new circleWithStaticMembers(5);

        // modify circle
        circle1.radius = 9;

        // display circle1 and circle2 after circle2 was created
        System.out.println("\nAfter creating circle2 and modifying circle1");
        System.out.println("circle1 radius (" + circle1.radius + ") and the number of the circle objects (" + circleWithStaticMembers.numberOfObjects + ")");
        System.out.println("circle1 radius (" + circle2.radius + ") and the number of the circle objects (" + circleWithStaticMembers.numberOfObjects + ")");
        
        /*
        In this program circleWithStaticMembers class is created and static variable numberOfObjects is created to track the how many circle objects are created.
        Each time a new objects is instantiated using either a constructor, static counter is incremented.

        In main method, the program creates a two circles objects and shows how the static variable is shared among all instances by displaying the updated count 
        after each objects is created. It is also modifies the radius of one objects to demonstrate that instances variable are separate, while the static variable\
        remains common to all objects.
        */
    }
}
