/*
instanceof operator
    It is used to check weather a objects belongs to a particular class or interface.
    Syntax:
        object instanceof ClassName
*/
class Animal{
    void sound(){
        System.out.println("Animal makes Sound");
    }
}

class Neko extends Animal{
    void sound(){
        System.out.println("Mew.. Mew");
    }
}
public class _01instanceOfOperator{
    public static void main(String[] args){
        Neko n = new Neko();

        System.out.println(n instanceof Neko); // true
        System.out.println(n instanceof Animal); // true
        System.out.println(n instanceof Object); // true 

        Animal a = new Neko();

        System.out.println(a instanceof Neko); // true
        System.out.println(a instanceof Animal); // true


        Animal animal = new Animal();

        System.out.println(animal instanceof Neko); // False -> here object is Animal not Neko
    }
}