package _03ThisReference;

/*
this keyword refers to the object itself. It can also be used inside the constructor to invoke another constructor of the same class
*/

class circle{
    private double radius;

    public circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
public class _01thisReference {
    public static void main(String[] args) {
        circle c01 = new circle(5);

        System.out.println(c01.getArea());
    }
}
