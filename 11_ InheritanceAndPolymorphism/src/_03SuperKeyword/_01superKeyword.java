package _03SuperKeyword;
/* 
Super Keyword in java is use to refer to the immediate parent class objects in a inheritance hierarchy.
It allows subclass to explicitly access the parents class data members or method while they were hidden or overridden.
It can also be used to access or invoke the constructor of Superclass or parent Class.

    Syntax:
        super() or super(parameter)
*/

class Pet{
    String name;

    Pet(){
        System.out.println("Animal constructor");
    }

    Pet(String name){
        this.name = name;
        System.out.println("Pet's name: " + name);
    }
}

class Neko extends Pet{
    Neko(){
        super(); // calling superclass constructor (here, Pet)
        System.out.println("Neko Constructor no args constructor");
    }

    Neko(String name){
        super(name); // calling parameterize super constructor
        System.out.println("Neko Parameterize constructor");
    }
}
public class _01superKeyword {
    public static void main(String[] args) {
        Neko neko = new Neko();
        Neko neko2 = new Neko("Mittens");
        /*
        Animal constructor
        Neko Constructor no args constructor
        Pet's name: Mittens
        Neko Parameterize constructor
        */

        neko.name = "Melo";
        System.out.println(neko2.name);
    }
}
