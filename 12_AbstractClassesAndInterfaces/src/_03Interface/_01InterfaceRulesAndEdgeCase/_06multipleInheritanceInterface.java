package _03Interface._01InterfaceRulesAndEdgeCase;

/*
    • Java doesn't support multiple inheritance with class due to ambiguity, but it support multiple inheritance using interfaces.

    • One class implementing multiple interface
                <<interface>>        <<interface>>
                Interface1           Interface2
                    ▲                   ▲
                     ╲                 ╱
                      ╲ «implements»  ╱
                       ╲             ╱
                      +-------------+
                      |    Class    |
                      +-------------+                
*/

interface canFly{
    void fly();
}

interface canSwim{
    void swim();
}

class Duck implements canFly, canSwim{
    public void fly(){
        System.out.println("Duck is Flying");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
}
public class _06multipleInheritanceInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
    }
}
