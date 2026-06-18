package DesignGuide;

/*
    • Use interface while defining capability.
        ❓"What object can do"
*/

interface Flyable{
    void fly();
}

class GeoBird implements Flyable{
    public void fly(){
        System.out.println("Bird is Flying");
    }
}

class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplane is flying");
    }
}

class Drone implements Flyable{
    public void fly(){
        System.out.println("Drone is flying");
    }
}

/*
    here,
        class Bird implements flyable
        class Airplane implements flyable
        class Drone implements flyable

    but Airplane is not Bird, as well as Drone is not Bird

    so there is no parent child relationship between them but all can fly, thus we use Interface.

        Flyable
        ▲
        │ implements
        ┌─┼─────┐
        Bird Airplane Drone
*/
class GeoDuck extends GeoAnimal implements Flyable {

    public void sound(){
        System.out.println("Quack..Quack..");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
}

public class _02designGuide {
    
}
