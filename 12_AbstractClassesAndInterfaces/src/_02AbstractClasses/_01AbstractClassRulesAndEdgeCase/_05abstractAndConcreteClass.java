package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/*
    • An abstract class cab be extend a concrete class
    • A concrete method can be overridden and make abstract
*/

class UNIVehicle{
    void start(){
        System.out.println("Vehicle Starts");
    }
}

abstract class UNICar extends UNIVehicle{
    @Override
    abstract void start();
}
public class _05abstractAndConcreteClass {
    
}
