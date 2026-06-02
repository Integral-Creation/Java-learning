package _04Overriding;

/*
    toString()
        this methods inherited from the Object class.
        Used to return a string representation of an Object
        By default it return a hash code as a unique identifiers
        It can be overridden to provide meaningful details
*/

class GlobalCar{
    String make;
    String model;
    int year;
    String color;

    GlobalCar(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return "[Maker: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color + "]";
    }

}
public class _03toStringMethod {
    public static void main(String[] args) {
        GlobalCar car = new GlobalCar("Ford" , "Mustang", 2025, "Gray");

        System.out.println(car);
    }
}
