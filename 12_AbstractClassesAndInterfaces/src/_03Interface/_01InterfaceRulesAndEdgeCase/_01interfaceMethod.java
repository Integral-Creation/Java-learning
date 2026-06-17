package _03Interface._01InterfaceRulesAndEdgeCase;
/*
    • All interface method are public abstract by default
*/

interface A{
    void show();

    /**Equivalent to */

    // public abstract void show();
}

class Test implements A{
    /* ❌ invalid
    void show(){
        // Cannot reduce the visibility of the inherited method
    }
    */
    public void show(){

    }
}

public class _01interfaceMethod {
    
}
