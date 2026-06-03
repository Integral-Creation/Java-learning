package _06Polymorphism;

import java.util.Scanner;

/*
Runtime Polymorphism:
    when the method thats gets executed is decided t runtime based ion the actual type of the objects.
*/

abstract class UNIVERSALAnimal{
    abstract void speak();
}

class UNIVERSALDog extends UNIVERSALAnimal{
    @Override
    public void speak(){
        System.out.println("The dog goes woof");
    }
}

class UNIVERSALCat extends UNIVERSALAnimal{
    @Override
    public void speak(){
        System.out.println("The cat goes meows");
    }
}
public class _03runtimePolymorphism {
    public static void main(String[] args) {
        UNIVERSALAnimal animal;

        Scanner scanner = new Scanner(System.in);
        animal = new UNIVERSALCat();

        System.out.println("Would you like a dog or a cat? (1 = dog , 2 = cat)");

        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new UNIVERSALDog();
            animal.speak();
        }else{
            animal = new UNIVERSALCat();
            animal.speak();
        }

        scanner.close();
    }
}
