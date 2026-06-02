package _04Overriding;

class GlobalAnimal{
    void move(){
        System.out.println("this animal is running");
    }
}

class GlobalDog extends GlobalAnimal{

}

class GlobalCat extends GlobalAnimal{

}

class GlobalFish extends GlobalAnimal{
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}

public class _02overridingCaseStudy {
    public static void main(String[] args) {
        GlobalDog dog = new GlobalDog();
        GlobalCat cat = new GlobalCat();
        GlobalFish fish = new GlobalFish();

        dog.move();
        cat.move();
        fish.move();
    }
}
