public class _01referenceVariableAndType {
    /*
    Objects are accessed via the object's reference variables, which contain reference to the objects.
    syntax:
    Classname objectRefVar;
    or
    ClassName objectRefVar = new ClassName();
    */

   public static void main(String[] args) {
        // Reference Variable Declaration
        student student01 = new student(); // student01 is a reference variable

        /*
        An object's data and methods can be accessed through the dot(.) operator via the object's reference variable;
        */

        student01.isStudying(); // output: Yes


   }
}

// Created Class Student
class student{
    int roll;
    String name;

    void isStudying(){
        System.out.println("Yes");
    }
}