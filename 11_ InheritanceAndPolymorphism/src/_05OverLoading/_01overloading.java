package _05OverLoading;
/*
Method Overloading means defining multiple methods with the same name in the same class, but different parameters.
The compiler decide which method to call based on:
    • number of arguments
    • type of arguments
    • order of arguments
this is compile time polymorphism.

*/

class A{
    public void sum(int a, int b){
        System.out.println(a + b);
    }
}

class B extends A{
    public void sum(double a, double b){
        System.out.println(a + b);
    }
}
public class _01overloading {
    public static void main(String[] args) {
        B n = new B();
        n.sum(2, 3); // 5
        n.sum(2.0, 3.0); // 5.0
    }
}
