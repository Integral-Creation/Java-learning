package _03Interface._01CaseStudy;

/*
        <<interface>>
           Edible
-------------------------------
+ howToEat() : String
-------------------------------
            ▲
            │ (implements)
     ..................

           Fruit                  Animal
---------------------      -------------------
                           + sound() : String
---------------------      -------------------
      ▲     ▲                    ▲
      │     │                    │
  -------- -------          -------------
  |Orange| |Apple|          |   Tiger   |
  -------- -------          -------------

            Chicken
-------------------------
+ sound() : String
+ howToEat() : String
-------------------------
      ▲
      │ inherits
   Animal

Chicken -------- implements -------> Edible
*/

interface Edible{
    public abstract String howToEat();
}

abstract class NewAnimal{
    public abstract String sound();
}

class Chicken extends NewAnimal implements Edible{
    @Override
    public String howToEat(){
        return "Chicken: Fry It";
    }

    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends NewAnimal{
    @Override
    public String sound(){
        return "Tiger: Roar";
    }
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple: Make an Apple-pie";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat(){
        return "Orange: Make Orange Juice";
    }
}

public class _01testEdible {
    public static void main(String[] args) {
        Object[] obj = {new Tiger(), new Chicken(), new Apple()};
        
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof Edible){
                System.out.println(((Edible)obj[i]).howToEat());
            }
            if(obj[i] instanceof NewAnimal){
                System.out.println(((NewAnimal)obj[i]).sound());
            }
        }
    }
}
