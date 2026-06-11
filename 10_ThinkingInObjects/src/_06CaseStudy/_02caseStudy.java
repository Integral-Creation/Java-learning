import java.util.Scanner;

class StudentGLOBAL{
    private String name;
    private int marks1, marks2, marks3;

    StudentGLOBAL(String name, int marks1, int marks2, int marks3){
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    StudentGLOBAL(StudentGLOBAL cpyStudent){
        this.name = cpyStudent.name;
        this.marks1 = cpyStudent.marks1;
        this.marks2 = cpyStudent.marks2;
        this.marks3 = cpyStudent.marks3;
    }

    public String getName(){
        return name;
    }

    public int getMarks1(){
        return marks1;
    }
    public int getMarks2(){
        return marks2;
    }
    public int getMarks3(){
        return marks3;
    }

    public void setMarks1(int marks1){
        this.marks1 = marks1;
    }
    public void setMarks2(int marks2){
        this.marks2 = marks2;
    }
    public void setMarks3(int marks3){
        this.marks3 = marks3;
    }

    public int getTotal(){
        return marks1 + marks2 + marks3;
    }

    public double getAverage(){
        return getTotal() / 3.0;
    }
}

public class _02caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        String name = scanner.nextLine();

        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();

        int inc1 = scanner.nextInt();
        int inc2 = scanner.nextInt();
        int inc3 = scanner.nextInt();

        StudentGLOBAL org = new StudentGLOBAL(name, marks1, marks2, marks3);
        StudentGLOBAL cpy = new StudentGLOBAL(org);

        org.setMarks1(org.getMarks1() + inc1);
        org.setMarks2(org.getMarks2() + inc2);
        org.setMarks3(org.getMarks3() + inc3);

        System.out.printf("Original: Name=%s, Total=%d, Average=%.2f%n", org.getName(), org.getTotal(), org.getAverage());
        System.out.printf("Original: Name=%s, Total=%d, Average=%.2f%n", cpy.getName(), cpy.getTotal(), cpy.getAverage());

        scanner.close();
    }
}
