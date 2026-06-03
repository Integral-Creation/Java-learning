package _01Intro;

/*
Interface:
    • A blueprint for a class that specifies a set of abstract methods that implement classes MUST define.
    or, • An interface is a blueprint of a class that defines what a class should do, but not how it should do it.
    • Supports multiple inheritance like behavior.
    • Used to achieve 100% Abstraction
*/

interface Predator{
    void hunt();
}

interface Prey{
    void flee();
}

class Rabbit implements Prey{ // here while implementing rabbit as Prey, we will get an error ->The type rabbit must implement the inherited abstract method Prey.flee() ❗ thus we have to define the method flee()

    @Override
    public void flee(){
        System.out.println("Rabbit is running away");
    }
}

class Fish implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("the fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("the fish is hunting");
    }
}

class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The Hawk is hunting");
    }
}
public class _02interface {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
