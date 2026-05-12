package _04ClassAbstractionAndEncapsulation;

/*
----------------------------------------
|                  BMI                 |
----------------------------------------
| - name   : String                    |
| - age    : int                       |
| - weight : double                    |
| - height : double                    |
----------------------------------------
| + BMI(name: String, age: int,        |
|       weight: double,                |
|       height: double)                |
| + BMI(name: String,                  |
|       weight: double,                |
|       height: double)                |
| + getBMI()    : double               |
| + getStatus() : String               |
----------------------------------------
*/

class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height){
        this(name, 20, weight, height);
    }

    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus(){
        double bmi = getBMI();
        if(bmi < 18.5){
            return "UnderWeight";
        }else if(bmi < 25){
            return "Normal";
        }else if(bmi < 30){
            return "OverWeight";
        }else{
            return "Obese";
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }
}
public class BMICaseStudy {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Tesla", 25, 145,70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
