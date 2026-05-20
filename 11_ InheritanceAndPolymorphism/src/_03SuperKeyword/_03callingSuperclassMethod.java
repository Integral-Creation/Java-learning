package _03SuperKeyword;
/*
The Keyword super can be used to reference a method other than the constructor in the superclass.
    Syntax:
        super.method(parameter);
*/

class Parent{
    void show(){
        System.out.println("Parent's Method");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child's Method");
    }

    void display(){
        super.show(); // calling Superclass method
        show(); // calling subclass method
    }
}

public class _03callingSuperclassMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        /**
        Parent's Method
        Child's Method
        */
    }
}
