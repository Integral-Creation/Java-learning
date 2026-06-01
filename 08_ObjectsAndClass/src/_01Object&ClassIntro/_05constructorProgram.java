class StudentUNI{
    String name = "Unknown";
    int age;
    double gpa;
    boolean isEnrolled;

    StudentUNI(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void details(){
        System.out.println("[Name: " + name + ", Age: " + age + ", GPA: " + gpa + ", Is Enrolled: " + isEnrolled + "]");
    }
}

public class _05constructorProgram {
    public static void main(String[] args) {
        StudentUNI s01 = new StudentUNI("Tesla", 20, 9.8);
        StudentUNI s02 = new StudentUNI("Einstein", 22, 8.66);

        s01.details();
        s02.details();
    }
}