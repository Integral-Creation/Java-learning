/*
-------------------------------------------------
|                    Course                     |
-------------------------------------------------
| - courseName      : String                    |
| - students        : String[]                  |
| - numberOfStudents: int                       |
-------------------------------------------------
| + Course(courseName: String)                  |
| + getCourseName()        : String             |
| + addStudent(student: String) : void          |
| + dropStudent(student: String): void          |
| + getStudents()          : String[]           |
| + getNumberOfStudents()  : int                |
-------------------------------------------------
*/

class Course{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudent(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
public class testCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("Tesla");
        course1.addStudent("Einstein");
        course1.addStudent("Newton");

        course2.addStudent("Ada");
        course2.addStudent("Feymen");

        System.out.println("number of students in course1 : " + course1.getNumberOfStudents());
        
        String[] students = course1.getStudent();
        for(int i = 0; i < course1.getNumberOfStudents() ; i++){
            System.out.println(students[i] + " ");
        }
        
        System.out.println();
        String[] studentsForCourse2 = course2.getStudent();
        for(int i = 0; i < course2.getNumberOfStudents() ; i++){
            System.out.println(studentsForCourse2[i] + " ");
        }
        System.out.println("number of students in course2 : " + course2.getNumberOfStudents());
        
    }
}
