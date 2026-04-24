/*
-----------------------------------------
|               Circle                  |
-----------------------------------------
| + radius: double                      |
-----------------------------------------
| + Circle()                            |
| + Circle(newRadius: double)           |
| + getArea(): double                   |
| + getPerimeter(): double              |
| + setRadius(newRadius: double): void  |
-----------------------------------------

* `+` indicates **public** access modifier.
*/

class SimpleCircle{
    double radius;

    /* non argument constructor*/
    SimpleCircle(){
        radius = 1;
    }

    /* argument constructor*/
    SimpleCircle(double newRadius){
        radius  =  newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
public class _02TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle01 = new SimpleCircle();
        System.out.println("the area of the circle of radius: "+circle01.radius+" is "+circle01.getArea());

        SimpleCircle circle02 = new SimpleCircle(125);
        System.out.println("the area of the circle of radius: "+circle02.radius+" is "+circle02.getArea());

        circle02.radius = 100;
        System.out.println("the area of the circle of radius: "+circle02.radius+" is "+circle02.getArea());


    }
}
