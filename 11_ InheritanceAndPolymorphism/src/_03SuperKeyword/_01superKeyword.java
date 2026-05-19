package _03SuperKeyword;
/* 
Super Keyword in java is use to refer to the immediate parent class objects in a inheritance hierarchy.
It allows subclass to explicitly access the parents class data members or method while they were hidden or overridden.
It can also be used to access or invoke the constructor of Superclass or parent Class.

    Syntax:
        super() or super(parameter)

    In previous Geometric Program:
            public Circle(String color, boolean filled, double radius){
                    this.radius = radius;
                    setColor(color);
                    setFilled(filled);
                }
            
    It can be written as using super keyword:
            public Circle(String color, boolean filled, double radius){
                    this.radius = radius;
                    super(color, radius);
                }

*/
public class _01superKeyword {
    
}
