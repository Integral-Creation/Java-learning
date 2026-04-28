package _06DataFieldEncapsulation;

public class _01dataFieldEncapsulation {
    /*
    Data fiels encapsulation makes data fields private data and makes the class easy to maintain.

    taking example: 08.04._01staticVariable.java
        The data fields radius and numberOfObjects in the circleWithStaticMembers class in 
        can be modified directly 
            egs:
                circle1.radius = 5 
                or
                circleWithStaticMembers.numberOfObjects = 10;
        
        this is not a good practice-for two reasons:
            • data may be tempered with.
                ex- numberOfObjects is to count the number of objects created, but it may be set to an arbitrary
                value
            • the class become difficult to maintain and vulnerable to bugs.
                ex- suppose we want to modify the circleWithStaticMembers class to ensure that the radius is 
                non-negative after other program have already used the class. You have to change not only the
                circleWithStaticMembers class but also the programs that use it, because the clients may have modified
                the radius directly (e.g. circle1.radius = -1)
    
    to prevent direct modification of data fields, you should declare the data fields private, using the private 
    modifies. this is known as Data fields encapsulation.
    
    A private data fields cannot be accessed by an objects from outside the class that defines the private field.
    however, a client often needs to retries and modify a data field. to make private field accessible, provide
    a get method to return its value. to enable a private data field accessible, provide a set method to set a new value.

    • get method is referred to as a getter (accessor)
    • set method is referred to as a setter (mutator)
    */

    /* Creating a new circle class with a private data field radius and its associated accessor and mutator methods. */

    /*
    -----------------------------------------
    |               Circle                  |
    -----------------------------------------
    | -radius: double                       |
    | -numberOfObjects: int                 |
    -----------------------------------------
    | +Circle()                             |
    | +Circle(radius: double)               |
    | +getRadius(): double                  |
    | +setRadius(radius: double): void      |
    | +getArea(): double                    |
    | +getNumberOfObjects(): int            |
    -----------------------------------------
    */

    public static class CircleWithPrivateDataFields{
        // Radius of the circle
        private double radius = 1;

        // number Of Objects 
        private static int numberOfObjects = 0;

        // Construct a circle with radius
        public CircleWithPrivateDataFields(){
            numberOfObjects++;
        }

        // Construct a circle with specidied radius
        public CircleWithPrivateDataFields(double newRadius){
            radius = newRadius;
            numberOfObjects++;
        }

        // return radius
        public double getRadius(){
            return radius;
        }

        // set a new radius
        public void setRadius(double newRadius){
            radius = (newRadius >= 0) ? newRadius : 0;
        }

        // return numberOfObjects
        public static int getNumberOfObjects(){
            return numberOfObjects;
        }

        // return area of this circle
        public double getArea(){
            return radius * radius * Math.PI;
        }
    }

    public static void main(String[] args) {
        CircleWithPrivateDataFields circle01 = new CircleWithPrivateDataFields(5.0);

        System.out.println("The area of the circle of radius " + circle01.getRadius() + " is " + circle01.getArea());
        
        // increase circle01 radius to 10%
        circle01.setRadius(circle01.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + circle01.getRadius() + " is " + circle01.getArea());

        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());

    }
}
