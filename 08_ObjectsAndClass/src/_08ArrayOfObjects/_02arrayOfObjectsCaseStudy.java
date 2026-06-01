package _08ArrayOfObjects;

class SuperCar{
    String model;
    String color;

    SuperCar(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
public class _02arrayOfObjectsCaseStudy {
    public static void main(String[] args) {
        SuperCar car01 = new SuperCar("Mclaren", "Persian Blue");
        SuperCar car02 = new SuperCar("Mustang", "Gray");
        SuperCar car03 = new SuperCar("Charger", "Yellow");

        SuperCar[] cars = {car01, car02, car03};

        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        /*
        for(SuperCar car: cars){
            car.drive();
        }
        */
       
        SuperCar[] cars2 = {
           new SuperCar("Lamborghini", "Yellow"),
            new SuperCar("Ferrari 488 GTB", "Red"),
            new SuperCar("Bugatti Chiron", "Blue")
        };
        
        for(SuperCar car: cars2){
            car.drive();
        }

    }
}
