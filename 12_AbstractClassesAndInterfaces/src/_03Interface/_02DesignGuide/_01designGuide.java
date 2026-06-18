package _03Interface._02DesignGuide;

/*
    • ❓To Decide when to use an Interface or a class, in general we use "is-a" relationship
*/

/** Use an Abstract when there is Strong "is-a" relationship*/
abstract class GeoAnimal{
    abstract void sound();
}

class GeoDog extends GeoAnimal{
    void sound(){
        System.out.println("Dog is barking");
    }
}

class GeoCat extends GeoAnimal{
    void sound(){
        System.out.println("Cat is meowing");
    }
}

/*
    here,
            Animal  Animal
            ▲       ▲
            │       │
            Dog     Cat
        Dog is a Animal
        Cat is a Animal
*/

public class _01designGuide {
    
}
