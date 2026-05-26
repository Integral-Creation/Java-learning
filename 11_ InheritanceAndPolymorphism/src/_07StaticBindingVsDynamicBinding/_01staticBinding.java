/*
Static Binding
    The binding which can be resolved at the compile time is called static binding or early binding.
    The binding of all static and private and final methods are done at the compile time.
*/

class superClass{
    static void print(){
        System.out.println("Static method in super class is called");
    }
}

class subclass extends superClass{
    static void print(){
        System.out.println("Static method in sub class is called");
    }
}

public class _01staticBinding {   
    public static void main(String[] args) {
        superClass.print();
        subclass.print();
    }
}