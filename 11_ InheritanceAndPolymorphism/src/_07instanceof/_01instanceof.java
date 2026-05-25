package _07instanceof;
/*
instanceof operator in java is used to check weather an object belong to a particular class or interface.
    syntax:
            object instanceof ClassName
*/

class Person{
    String name;
}

class Student extends Person{
    int rollNo;
}
public class _01instanceof {
    public static void main(String[] args) {
        Student s01 = new Student();

        System.out.println(s01 instanceof Student); // true
        System.out.println(s01 instanceof Person); // true
    }
}
