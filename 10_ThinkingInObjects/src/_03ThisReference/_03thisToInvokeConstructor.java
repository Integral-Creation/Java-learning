package _03ThisReference;

/*
this keyword can be used to invoke constructor of the same class.
*/

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius; // this keyword is used to reference the hidden data field of object being constructed
    }

    public Circle(){
        this(1.0); // this keyword is used to invoke another constructor 
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
public class _03thisToInvokeConstructor {
    public static void main(String[] args) {
        Circle c01 = new Circle(2);

        System.out.println(c01.getRadius());
        System.out.println(c01.getArea());
    }
}
