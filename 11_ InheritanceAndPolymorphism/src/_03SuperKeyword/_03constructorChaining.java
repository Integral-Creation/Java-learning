package _03SuperKeyword;
/*
Constructor Chaining in java is the process of calling a sequence of constructor:
    it can be done in two ways;
        • by using this() keyword for chaining constructor in same class.
        • by using super() keyword for chaining constructor from parent class
*/

/*
                ┌─────────────┐
                │   Person    │
                ├─────────────┤
                │ +Person()   │
                └──────▲──────┘
                       │
                       │ extends
                       │
                ┌─────────────┐
                │  Employee   │
                ├─────────────┤
                │ +Employee() │
                │ +Employee(  │
                │   s:String) │
                └──────▲──────┘
                       │
                       │ extends
                       │
                ┌─────────────┐
                │   Faculty   │
                ├─────────────┤
                │ +Faculty()  │
                └─────────────┘
*/

class Person{
    public Person(){
        System.out.println("(1) Performs Person's task!");
    }
}

class Employee extends Person{
    public Employee(){
        this("(2) Invoke Employee's overload constructor");
        System.out.println("(3) Performs Employee's task!");
    }

    public Employee(String s){
        System.out.println(s);
    }
}
class Faculty extends Employee{
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
}
public class _03constructorChaining {
    public static void main(String[] args) {
        new Faculty();
    }
}
