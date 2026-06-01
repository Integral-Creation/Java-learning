package _01Intro;
/*
                    ┌─────────────────┐
                    │    Organism     │
                    ├─────────────────┤
                    │ + isAlive: boolean │
                    ├─────────────────┤
                    │ + Organism()    │
                    └────────┬────────┘
                             │
            ┌────────────────┴────────────────┐
            │                                 │
            ▼                                 ▼
 ┌─────────────────────┐          ┌─────────────────────┐
 │   AnimalKingdom     │          │   PlantKingdom      │
 ├─────────────────────┤          ├─────────────────────┤
 │ + eating(): void    │          │ + photosynthesize(): void │
 └─────────┬───────────┘          └─────────┬───────────┘
           │                                │
     ┌─────┴─────┐                          │
     │           │                          │
     ▼           ▼                          ▼
┌───────────┐ ┌───────────┐          ┌───────────┐
│ CanisLupus│ │FelisCatus │          │   Roses   │
│FamiliarsDog│ │   Cat    │          │           │
├───────────┤ ├───────────┤          ├───────────┤
│           │ │           │          │           │
└───────────┘ └───────────┘          └───────────┘
*/
class Organism{
    boolean isAlive;

    Organism(){
        this.isAlive = true;
    }
}

class AnimalKingdom extends Organism{
    
    void eating(){
        System.out.println("Animal is eating");
    }
}

class PlantKingdom extends Organism{
    void photosynthesize(){
        System.out.println("The plant Absorbs sunlight");
    }
}
class CanisLupusFamiliarsDog extends AnimalKingdom{

}

class FelisCatusCat extends AnimalKingdom{

}

class Roses extends PlantKingdom{

}
public class _02CaseStudy {
    public static void main(String[] args) {
        CanisLupusFamiliarsDog dog = new CanisLupusFamiliarsDog();

        FelisCatusCat cat = new FelisCatusCat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        dog.eating();
        cat.eating();

        Roses rose = new Roses();
        rose.photosynthesize();
    }
}
