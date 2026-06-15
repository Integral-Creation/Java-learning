package _02AbstractClasses;
/*
                    <<abstract>>
                  GeometricObjectGlobal
-------------------------------------------------
- color : String
- filled : boolean
- dateCreated : Date
-------------------------------------------------
# GeometricObjectGlobal()
# GeometricObjectGlobal(color:String, filled:boolean)
+ getColor() : String
+ setColor(color:String) : void
+ isFilled() : boolean
+ setFilled(filled:boolean) : void
+ getDateCreated() : Date
+ toString() : String
+ getArea() : double {abstract}
+ getPerimeter() : double {abstract}
-------------------------------------------------
             ▲                     ▲
             │                     │
             │                     │
      ----------------     ----------------
      |    Circle    |     |  Rectangle   |
      ----------------     ----------------
      - radius:double      - width:double
                           - height:double
      ----------------     ----------------
      + Circle()           + Rectangle()
      + Circle(radius)     + Rectangle(width,height)
      + Circle(radius,
        color,filled)      + Rectangle(width,height,
                                         color,filled)
      + getRadius()        + getWidth()
      + setRadius()        + setWidth()
      + getDiameter()      + getHeight()
                            + setHeight()
      ----------------     ----------------
*/

abstract class GeometricObjectGlobal{
    /**Private data fields */
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    /**Default Constructor */
    protected GeometricObjectGlobal(){
        dateCreated = new java.util.Date();
    }

    /**Parameterized Constructor */
    protected GeometricObjectGlobal(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color*/
    public String getColor(){
        return this.color;
    }
    /** Set color */
    public void setColor(String color){
        this.color = color;
    }
    /** Return filled */
    public boolean isFilled(){
        return filled;
    }
    /** Set Filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    /** Get date created */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "Created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract Method getArea */
    public abstract double getArea();
    
    /** Abstract Method getPerimeter */
    public abstract double getPerimeter();
}

class CircleGlobal extends GeometricObjectGlobal{
    private double radius;

    /** Default constructor */
    public CircleGlobal(){
    }

    /** Parameterized constructor */
    public CircleGlobal(double radius){
        this.radius = radius;
    }
    
    /** Parameterized constructor */
    public CircleGlobal(String color, boolean filled, double radius){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    /** Return radius
     */
    public double getRadius(){
        return radius;
    }
    /** Set Radius */
    public void setRadius(double radius){
        this.radius = radius;
    }
    /** getArea Overriding abstractMethod */
    public double getArea(){
        return radius * radius;
    }
    /** getPerimeter Overriding abstractMethod */
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    /** shows Details */
    public void printCircle(){
        System.out.println("The Circle is created " + getDateCreated() + " and the radius is : " + radius);
    }
}


class RectangleGlobal extends GeometricObjectGlobal{
    private double width;
    private double length;

    /** Default constructor */
    public RectangleGlobal(){
    }

    /** Parameterized constructor */
    public RectangleGlobal(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    /** Parameterized constructor */
    public RectangleGlobal(String color, boolean filled, double width, double length){
        this.width = width;
        this.length = length;
        
        setColor(color);
        setFilled(filled);
    }
    /** Return width*/
    public double getWidth(){
        return width;
    }
    /** Return length */
    public double getLength(){
        return length;
    }
    /** Set Radius */
    public void setWidth(double width){
        this.width = width;
    }
    /** Return length */
    public void setLength(double length){
        this.length = length;
    }
    
    /** getArea Overriding abstractMethod */
    public double getArea(){
        return width * length;
    }
    /** getPerimeter Overriding abstractMethod */
    public double getPerimeter(){
        return 2 * (width + length);
    }
    /** shows Details */
    public void printCircle(){
        System.out.println("The Rectangle is created " + getDateCreated() + " the width is : " + width + " and the length is " + length);
    }
}
public class _01caseStudy {
    /** Method for comparing the area of two geometric object */
    public static boolean equalArea(GeometricObjectGlobal obj1, GeometricObjectGlobal obj2){
        return obj1.getArea() == obj2.getArea();
    }

    /** Method for displaying */
    public static void displayGeometricObject(GeometricObjectGlobal obj){
        System.out.printf("The area is %.2f\n", obj.getArea());
        System.out.printf("The perimeter is %.2f\n", obj.getPerimeter());
    }
    public static void main(String[] args) {
        GeometricObjectGlobal geoObjectGlobal01 = new CircleGlobal(5);
        GeometricObjectGlobal geoObjectGlobal02 = new RectangleGlobal(5,7);

        System.out.println("The two object have the same area?");
        System.out.println((equalArea(geoObjectGlobal01, geoObjectGlobal02)) ? "Yes" : "No");

        System.out.println("\nCircle");
        displayGeometricObject(geoObjectGlobal01);
        System.out.println("\nRectangle");
        displayGeometricObject(geoObjectGlobal02);
    }
}

/**
 * here the methods getArea() and getPerimeter() are defined in the GeometricObjectGlobal Class are overridden in the CircleGlobal and the RectangleGlobal class
 * 
 * the statement at line(201 - 202)
 *  GeometricObjectGlobal geoObjectGlobal01 = new CircleGlobal(5);
 *  GeometricObjectGlobal geoObjectGlobal02 = new RectangleGlobal(5,7);
 * create a new circle and rectangle and assign the variables geoObjectGlobal01 and geoObjectGlobal02.
 * these variable are GeometricObjectGlobal type.
 * 
 * while invoking the getArea() and getPerimeter() since the variable is GeometricObjectGlobal type but the method defined int he Circle and rectangle are used.
 * 
 * The JVM dynamically Determine which method to invoke at runtime, depending on the actual object that invokes the method.
 */
