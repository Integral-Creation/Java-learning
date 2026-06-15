package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/*
    • An abstract method can only be exist inside an abstract class
*/

/** ❌Invalid
class Animal{
    abstract void makeSound(); // Error
}
*/

/** ✔️Valid */
abstract class AnimalUniversal{
    abstract void makeSound();
}

/*
    • An abstract class may contain no abstract methods
*/
abstract class GlobalAnimal{
    void eat(){
        System.out.println("Animal is eating");
    }
    /* no abstract method exits but class is still abstract */
}
public class _01abstractMethod {
    public static void main(String[] args) {
        // GlobalAnimal animal = new GlobalAnimal(); // Not allowed
    }
}
