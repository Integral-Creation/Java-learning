package _06Polymorphism;
/*
Polymorphism in java is a core concept in OOPs, that allows objects to behave differently based on their specific class types.
The world polymorphism means many forms, and its came from greeks word poly means "many" and morph means "forms".
It's one of the four main OOPs concepts:
    • class
    • inheritance
    • polymorphism
    • encapsulation

Types of Polymorphism:
    Java support only two types:
        • Compile time Polymorphism
            method overloading
        • Run time Polymorphism
            method overriding
*/

// compile time polymorphism
class MathOperation{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
}
public class _01intro {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println(m.add(1, 4)); // 5
        System.out.println(m.add(1.0, 4.0)); // 5.0

        /*
        Java compiler decides which method to call according to the arguments data-type.
        */
    }
}
