package _01Intro;

/*
Inheritance in java is core OOPs concept that allows a class to acquire properties and behaviors from another class. It helps in creating a new class from existing class.
It is an important and powerful features for reusing same code.
*/

/*
                    -------------------
                    |     Animal      |
                    -------------------
                    | + sound(): void |
                    -------------------
                             ▲
               --------------|--------------
               |                             |
     -------------------         -------------------
     |       Dog       |         |      Neko       |
     -------------------         -------------------
     | + sound(): void |         | + sound(): void |
     -------------------         -------------------
*/

class Animal{ // parents
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{ // child
    void sound(){
        System.out.println("Dog barks");
    }
}
class Neko extends Animal{ // child
    void sound(){
        System.out.println("Mew.. Mew..");
    }
}
public class _01Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Animal makes a sound

        Dog d = new Dog();
        d.sound(); // Dog barks

        Neko n = new Neko();
        n.sound(); // Mew.. Mew..
    }  
}
