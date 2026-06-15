package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/*
    • Arrays of abstract class type are allowed
*/

abstract class UNIAnimal{

}

class UNIDog extends UNIAnimal{
    UNIDog(){
        System.out.println("Dog Constructor");
    }
}

public class _07abstractClassArray {
    public static void main(String[] args) {
        UNIAnimal[] animals = new UNIAnimal[3];

        animals[0] = new UNIDog();
        animals[1] = new UNIDog();
        animals[2] = new UNIDog();

        /*
            Dog Constructor
            Dog Constructor
            Dog Constructor
        */
    }
}
