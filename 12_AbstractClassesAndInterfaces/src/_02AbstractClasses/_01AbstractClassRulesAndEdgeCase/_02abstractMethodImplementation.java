package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/*
    • If a subclass doesn't implement all abstract method, it must also be abstract
*/

abstract class UniversalAnimal{
    abstract void makeSound();
}

abstract class UniversalDog extends UniversalAnimal{
    // makeSound() not implemented
    // • valid if Dog is abstract
}

/**  if Dog is concrete */
// class UniversalDog extends UniversalAnimal{
//     /** Compile time error*/
// }

/** We must implement the abstract method */
class UniversalCat extends UniversalAnimal{
    @Override
    public void makeSound(){
        System.out.println("Meow...Meow...");
    }
}
public class _02abstractMethodImplementation {
    public static void main(String[] args) {
        UniversalCat c = new UniversalCat();
        c.makeSound();
    }
}
