package _03Interface._01InterfaceRulesAndEdgeCase;

/*
    • Cannot create Object if an interface
    • Cannot Instantiate a constructor
*/

interface Tests{
    /*
    Tests(){
        // ❌ Compile Error: Interfaces cannot have constructors
    }
    */
}

public class _03interfaceObject {
    public static void main(String[] args) {
        // Tests t = new Tests(); // ❌ Compile Error: Cannot instantiate the type Tests
    }
}
