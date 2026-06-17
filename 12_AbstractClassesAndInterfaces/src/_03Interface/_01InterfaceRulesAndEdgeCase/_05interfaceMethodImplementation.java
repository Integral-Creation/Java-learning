package _03Interface._01InterfaceRulesAndEdgeCase;

/*
    • A class must implement all interface methods
*/

interface A1{
    void m1();
    void m2();
}

class A2 implements A1{
    public void m1(){
        
    }

    public void m2(){
        
    }
}

/** Or Declare Abstract class */
abstract class B1 implements A1{
    public void m2(){
        // ✔️ Valid
    }
}

public class _05interfaceMethodImplementation {
    
}
