package _08ArrayOfObjects;

/*
Arrays of objects:
    An arrays of objects is actually an array of reference variable.       
*/
class Student{
    private String name;
    private int erp;

    // constructor
    Student(String name, int erp){
        this.name = name;
        this.erp = erp;
    }

    public void setStudent(String name, int erp){
        this.name = name;
        this.erp = erp;
    }

    public void display(){
        System.out.println(name + " " + erp);
    }
}
public class _01arrayOfObjects {
    public static void main(String[] args) {
        // creating array of objects
        Student[] students = {
            new Student("Tesla", 01),
            new Student("Enstein", 02)
        };
        
        for(int i = 0; i < students.length; i++){
            students[i].display();
        }
    }
}
