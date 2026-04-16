package _05Constant;

public class NamedConstant {
    public static void main(String[] args){
        /*
        constant: values that are permanent data that never change during the execution
        Syntax:
            final datatype CONSTANTName = value;
         */
        final double PI = 3.14159;
        double r = 20;
        double area = r * r * PI;

        System.out.println("area of the circle is "+area+"cm²");
    }
}
