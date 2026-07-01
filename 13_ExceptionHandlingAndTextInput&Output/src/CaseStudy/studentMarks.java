import java.util.Scanner;

class StudentGlobal{
    String name;
    int marks;

    StudentGlobal(String name, int marks) throws InvalidMarksException{
        this.name = name;
        this.marks = setMarks(marks);
    }

    int setMarks(int marks) throws InvalidMarksException{
        if(marks < 0 || marks > 100){
            throw new InvalidMarksException("Invalid marks");
        }
        return marks;
    }

    String getName(){
        return this.name;
    }

    String getGrade(){
        if(marks >= 90){
            return "A";
        }else if(marks >= 75){
            return "B";
        }else if(marks >= 50){
            return "C";
        }else{
            return "Fail";
        }
    }
}

// custom exception class 
class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}

public class studentMarks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // try-catch block
        try{
            String name = scanner.nextLine();
            int marks = scanner.nextInt();
            
            StudentGlobal student = new StudentGlobal(name, marks);
            System.out.println("student name: " + student.getName() + " ,Grade: " + student.getGrade());
        }catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
