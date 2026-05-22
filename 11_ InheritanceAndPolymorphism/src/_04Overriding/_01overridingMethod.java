package _04Overriding;
/*
Method overriding in java allows subclass to provide a specific implementation of a method that is already derived in parent class.
The method in the subclass must have:
    • same method name
    • same parameter
    • compatible return type

@Override annotation is used because compiler check correctness.
*/

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class _01overridingMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Dog barks

        Animal cat = new Cat();
        cat.sound(); // Cat meows
        /*
        even though the reference type is Animal, JVM call overridden method of Cat at runtime.
        */
    }
}
