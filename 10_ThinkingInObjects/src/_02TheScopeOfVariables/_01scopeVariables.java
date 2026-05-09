package _02TheScopeOfVariables;

/*
Variable Scope in Java
Scope defines where a variable is accessible in your code.

    1. Local Variables
        Declared inside a method or block — only accessible within that block.
    2. Instance Variables (Fields)
        Declared inside a class but outside any method — accessible by all methods of the class via an object.  
*/

class f{
    private int x = 0; // Instance Variable
    private int y = 0;

    public f(){

    }

    public void p(){
        int x = 1; // local variable
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    void display(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}

public class _01scopeVariables {
    public static void main(String[] args) {
        f newF = new f();

        newF.p();
    }
}
