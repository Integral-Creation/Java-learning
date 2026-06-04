package _14Composition;

/*
Composition:
    Represents a "Part-of" relationship between objects.
        for example, an Engine is "part of" a car.
        Allows complex objects to be constructed from smaller objects.

+------------------+
|       Car        |
+------------------+
| - model : String |
| - year  : int    |
| - engine: Engine |
+------------------+
| + start()        |
+------------------+
         ◆
         |
         |
+------------------+
|      Engine      |
+------------------+
| - type : String  |
+------------------+
| + start()        |
+------------------+

◆ -> represents composition
*/

class Car{
    String model;
    int year;

    Engine engine;

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}

class Engine{
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}
public class _01composition {
    public static void main(String[] args) {
        Car car = new Car("Mclaren", 2026, "v8");

        System.out.println(car.model);
        System.out.println(car.year);
        // System.out.println(car.engine); // here -> _14Composition.Engine@7344699f it will produce hash code thus we have to use access modifiers
        System.out.println(car.engine.type);


        car.start();
    }
}
