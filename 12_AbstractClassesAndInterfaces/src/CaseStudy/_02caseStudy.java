import java.util.Scanner;

abstract class ShapeGLOBAL{
    double area(){
        return 0.0;
    }
}

class Circle extends ShapeGLOBAL{
    double r;
    Circle(double r){
        this.r = r;
    }

    @Override
    public double area(){
        return r * r * Math.PI;
    }
}

class Rectangle extends ShapeGLOBAL{

    double l; 
    double w;

    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    @Override
    public double area(){
        return l * w;
    }
}
class Triangle extends ShapeGLOBAL{

    double a;
    double b;
    double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isValid(){
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
    }

    @Override
    public double area(){
        double s = (a + b +c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class _02caseStudy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String shape = scanner.next();
            
            if(shape.equals("Circle")){
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf( "Area: %.2f%n", circle.area());
            }
            if(shape.equals("Triangle")){
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                
                Triangle tri = new Triangle(a, b, c);
                if(tri.isValid()){
                    System.out.printf( "Area: %.2f%n", tri.area());
                }else{
                    System.out.println("Invalid Triangle");
                }
            }
            if(shape.equals("Rectangle")){
                double l = scanner.nextDouble();
                double w = scanner.nextDouble();
                
                Rectangle rec = new Rectangle(l, w);
                System.out.printf( "Area: %.2f%n", rec.area());   
            }
        }
        scanner.close();
    }    
}