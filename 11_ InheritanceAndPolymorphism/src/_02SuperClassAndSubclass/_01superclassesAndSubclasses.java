package _02SuperClassAndSubclass;
/*
Inheritance enables us to define a general class(e.g. superclass) and later extend it to more specialized class(e.g. subclasses).
    • A subclass can reuse the fields and methods of the parents class without rewriting the code.
    • A subclass can add its own fields and methods or modify existing ones to extended functionality.
*/

/*
Consider geometric objects. suppose we want to create a subclass named circle and rectangle.
Geometric objects have a common properties and behaviors.
thus a general class GeometricObjects can be used to models all geometric objects(i.e circle and rectangle).
*/

/*
                          -----------------------------
                          |      GeometricObject      |
                          -----------------------------
                          | - color       : String    |
                          | - filled      : boolean   |
                          | - dateCreated : java.util.Date |
                          -----------------------------
                          | + GeometricObject()       |
                          | + GeometricObject(        |
                          |    color: String,         |
                          |    filled: boolean)       |
                          | + getColor() : String     |
                          | + setColor(color:String): |
                          |      void                 |
                          | + isFilled() : boolean    |
                          | + setFilled(filled:boolean): |
                          |      void                 |
                          | + getDateCreated():       |
                          |      java.util.Date       |
                          | + toString() : String     |
                          -----------------------------
                                      ▲
                    ------------------|------------------
                    |                                   |
        -------------------------        -------------------------
        |          Circle       |        |        Rectangle      |
        -------------------------        -------------------------
        | - radius : double     |        | - width  : double     |
        |                       |        | - height : double     |
        -------------------------        -------------------------
        | + Circle()            |        | + Rectangle()         |
        | + Circle(radius:      |        | + Rectangle(width:    |
        |      double)          |        |      double,          |
        | + Circle(radius:      |        |      height: double)  |
        |      double,          |        | + Rectangle(width:    |
        |      color:String,    |        |      double,          |
        |      filled:boolean)  |        |      height: double,  |
        | + getRadius():double  |        |      color:String,    |
        | + setRadius(radius:   |        |      filled:boolean)  |
        |      double): void    |        | + getWidth(): double  |
        | + getArea(): double   |        | + getHeight():double  |
        | + getPerimeter():     |        | + setWidth(width:     |
        |      double           |        |      double): void    |
        | + getDiameter():      |        | + setHeight(height:   |
        |      double           |        |      double): void    |
        | + printCircle():void  |        | + getArea(): double   |
        |                       |        | + getPerimeter():     |
        |                       |        |      double           |
        -------------------------        -------------------------
*/
// superclass -> GeometricObjects
class GeometricObject{
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    // Default constructor
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    // Constructor
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setFilled(boolean isFilled){
        this.filled = isFilled;
    }

    public boolean getFilled(){
        return filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "Created on " + dateCreated + "\n color: " + color + " and filled: " + filled;    
    }
}

// subclass-> Circle
class Circle extends GeometricObject{
    private double radius;

    public Circle(){ 
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println("The Circle is created " + getDateCreated() + " and the radius is : " + radius);
    }
}

// subclass -> rectangle
class Rectangle extends GeometricObject{
    private double width;
    private double height;

    Rectangle(){
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
public class _01superclassesAndSubclasses {
    public static void main(String[] args) {
        Circle circle01 = new Circle(1);
        System.out.println("A circle:" + circle01.toString());
        System.out.println("The color is: " + circle01.getColor());
        System.out.println("The radius is: " + circle01.getRadius());
        System.out.println("The area is: " + circle01.getArea());
        System.out.println("The diameter is: " + circle01.getDiameter());

        Rectangle rectangle01 = new Rectangle(2,4);
        System.out.println("\n Rectangle: " + rectangle01.toString());
        System.out.println("The area is: " + rectangle01.getArea());
        System.out.println("The perimeter is: " + rectangle01.getPerimeter());
    }
}
