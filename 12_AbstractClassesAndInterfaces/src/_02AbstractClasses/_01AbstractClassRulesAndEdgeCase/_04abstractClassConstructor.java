package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/** Abstract class can have constructor */

abstract class GlobalVehicle{
    GlobalVehicle(){
        System.out.println("Vehicle Constructor");
    }
}

class GlobalCar extends GlobalVehicle{
    GlobalCar(){
        System.out.println("Car Constructor");
    }
}
public class _04abstractClassConstructor {
    public static void main(String[] args) {
        GlobalCar car = new GlobalCar();
        car.getClass();
    }
    /*
    Vehicle Constructor
    Car Constructor
    */
}
