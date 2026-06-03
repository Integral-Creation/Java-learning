package _06Polymorphism;
/*
Polymorphism:
    "POLY" -> many
    "MORPH" -> shape
    • Objects can identify as other objects
    • objects can be treated as the objects of a common superclass
*/

abstract class GlobalVEHICLE{
    abstract void go();
}

class CAR extends GlobalVEHICLE{
    @Override
    void go(){
        System.out.println("You drive the car");
    }
}

class BIKE extends GlobalVEHICLE{
    @Override
    void go(){
        System.out.println("You ride the bike");
    }
}
class BOAT extends GlobalVEHICLE{
    @Override
    void go(){
        System.out.println("You sail the boat");
    }
}

public class _02polymorphism {
    public static void main(String[] args) {
        CAR car = new CAR();
        BIKE bike = new BIKE();
        BOAT boat = new BOAT();

        car.go();
        bike.go();
        boat.go();

        /*
        CAR[] cars = {car, bike, boat};
        -> Type mismatch: cannot convert from BIKE to CAR
        boat cannot be resolved to a variable
        */
        GlobalVEHICLE[] cars = {car, bike, boat};
        for(GlobalVEHICLE i : cars){
            i.go();
        }
    }
}
