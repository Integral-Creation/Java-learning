package _03Interface._01InterfaceRulesAndEdgeCase;
/*
    • Interface variable are public static final
*/

interface Constants{
    // double PI = 3.14;

    /** Equivalent to */
    public static final double Pi = 3.14;
}

class Test implements Constants{
    public void change(){
        // Constants.Pi = 3.145; // Compile-time Error: Cannot assign a value to a final variable
    }
}

public class _02interfaceVariable {
    
}
