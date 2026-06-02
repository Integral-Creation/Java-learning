package _01Intro;
/*
Abstract:
    • it is used to define Abstract class and methods
    • Abstraction is the process of hiding implementation details and showing only the essential features.
    • Abstract classes CAN't be instantiated directly
    • Can contain 'abstract' methods (which must be implemented)
    • Can contain 'concrete' methods (which are inherited)
*/

abstract class Shape{
    abstract double area(); // abstract method

    void display(){ // concrete method
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{
    double base;
    double height;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double area(){
        return 0.5 * base * height;
    }
    
}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

}
public class _01abstraction {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Cannot instantiate the type Shape

        Circle c = new Circle(3);
        Triangle tri = new Triangle(4,5);
        Rectangle rec = new Rectangle(7,8);

        c.display(); // This is a Shape

        System.out.println(c.area());
        System.out.println(tri.area());
        System.out.println(rec.area());

    }
}
