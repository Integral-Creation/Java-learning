class Car{ 
    /*object -> entity that holds data (Attributes) and can performs actions
    Its is reference data type
    */
    
    // Attributes
    String make = "ford";
    String model = "Mustang";
    int year = 2025;
    double price = 1000000.00;
    boolean isRunning = false;

    // Actions or Methods
    void start(){
        this.isRunning = true; 
        System.out.println("You Start the engine");
    }
    void stop(){
        this.isRunning = false;
        System.out.println("You Stopped the engine");
    }
    void drive(){
        System.out.println("You Drive the  " + model);
    }
    void brake(){
        System.out.println("You break the " + model);
    }
}

public class carCaseStudy {
    public static void main(String[] args) {
        Car car = new Car();
        
        System.out.println(car); // prints address of an object ex- Car@251a69d7

        // car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();
    }
}
