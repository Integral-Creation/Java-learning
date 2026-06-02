/*
Dynamic Binding
    Dynamic binding or late binding or runtime polymorphism means that the methods to be executed is decided at runtime, not at compile time.
*/

class AnimalClass{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends AnimalClass{
    @Override void sound(){
        System.out.println("Dog barks");
    }
}

public class _02dynamicBinding{
    public static void main(String[] args){
        AnimalClass a = new Dog();

        a.sound();
    }
}