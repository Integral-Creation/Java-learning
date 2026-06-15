package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/*
    • Abstract class can be used as reference type
*/

abstract class UniversalEmployee{
    abstract void showSalary();
}

class UniversalManager extends UniversalEmployee{
    void showSalary(){
        System.out.println("Salary: " + "10000");
    }
}
public class _06abstractClassUseAsReference {
    public static void main(String[] args) {
        UniversalEmployee manager = new UniversalManager();
        /* The object is manager, but reference type is UniversalEmployee */ 

        manager.hashCode();
    }
}
