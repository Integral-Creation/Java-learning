import java.util.Scanner;

class StudentUNIVERSAL{
    private String name;
    private int rollNo;
    private int[] marks = new int[3];

    static int counter =  1001;
    static String instituteName = "Institute";

    StudentUNIVERSAL(String name, int m1, int m2, int m3){
        this.name = name;

        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;

        this.rollNo = counter++;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    public String getResult(){
        if(marks[0] >= 35 && marks[1] >= 35 && marks[2] >= 35){
            return "Pass";
        }else{
            return "Fail";
        }
    }
}

public class _01caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        int n = scanner.nextInt();
        StudentUNIVERSAL[] students = new StudentUNIVERSAL[n];

        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int m3 = scanner.nextInt();

            students[i] = new StudentUNIVERSAL(name, m1, m2, m3);
        }

        int topperRoll = students[0].getRollNo();
        int maxTotal = students[0].getTotal();

        for(int i = 0; i < n; i++){
            System.out.println("Roll: " + students[i].getRollNo() + ", Name: " + students[i].getName() + ", Total: " + students[i].getTotal() + ", Result: " + students[i].getResult());
            if(students[i].getTotal() > maxTotal){
                maxTotal = students[i].getTotal();
                topperRoll = students[i].getRollNo();
            }else if(students[i].getTotal() == maxTotal && students[i].getRollNo() < topperRoll){
                topperRoll = students[i].getRollNo();
            }
        }

        scanner.close();
    }
}

