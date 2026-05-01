package _07PassingObjectsToMethod;

/*
Passing an object to a method is to pass the reference of the object,
means the method receives a copy of the reference (memory address), not the object itself.
*/

class car{
    private String brand;
    private int speed;
    private String color;

    // constructor
    car(String brand, int speed, String color){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // getter
    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setSpeed(int speed){
        if(speed >= 0){
            this.speed = speed;
        }else{
            System.out.println("Speed can't be negative!");
        }
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}

public class _01passingObjectToMethod {
    public static void main(String[] args) {
        car car01 = new car("Tesla", 200, "Carbon gray");

        System.out.println(car01.getBrand());
        System.out.println(car01.getColor());
        System.out.println(car01.getSpeed());

        // MModifying private fields via setter
        car01.setBrand("Mclaren");
        car01.setColor("Charcoal gray");
        car01.setSpeed(220);

    }

    // passing object with private fields to a method
    public static void printCarInfo(car c){
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Color: " + c.getColor());
        System.out.println("Speed: " + c.getSpeed());
    } 
}
