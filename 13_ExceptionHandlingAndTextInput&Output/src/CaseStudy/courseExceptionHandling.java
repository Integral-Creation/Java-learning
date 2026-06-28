import java.util.Scanner;

interface Discountable{
    int discount();
}

abstract class Course{
    String studentName;
    int hours;

    Course(String studentName, int hours){
        this.studentName = studentName;
        this.hours = hours;
    }

    abstract int calculateFee();
}

class RegularCourse extends Course implements Discountable{
    RegularCourse(String studentName, int hours) {
        super(studentName, hours);
    }

    @Override
    public int discount(){
        if(hours > 10){
            return 5;
        }
        return 0;
    }

    int calculateFee(){
        int fee = 500 * hours;
        return fee - (fee * discount() / 100);
    }
}

class CrashCourse extends Course implements Discountable{
    CrashCourse(String studentName, int hours) {
        super(studentName, hours);
    }

    @Override
    public int discount(){
        if(hours > 5){
            return 10;
        }
        return 0;
    }

    int calculateFee(){
        int fee = 800 * hours;
        return fee - (fee * discount() / 100);
    }
}

class InvalidHoursException extends Exception{
    InvalidHoursException(String message){
        super(message);
    }
}

class InvalidCourseException extends Exception{
    InvalidCourseException(String message){
        super(message);
    }
}

public class courseExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++){
            try{
                String courseType = scanner.nextLine();
                String studentName = scanner.nextLine();

                int hours = Integer.parseInt(scanner.nextLine());

                if(hours <= 0){
                    throw new InvalidHoursException("Hours must be greater than zero");
                }

                Course course;

                if(courseType.equals("Regular")){
                    course = new RegularCourse(studentName, hours);
                }else if(courseType.equals("Crash")){
                    course = new CrashCourse(studentName, hours);
                }else{
                    throw new InvalidCourseException("Invalid course type specified");
                }

                System.out.println("Student: " + studentName + ", Total Fee: " + course.calculateFee());
            }
            catch (InvalidHoursException e) {
                System.out.println("InvalidHoursException: " + e.getMessage());
            }
            catch (InvalidCourseException e) {
                System.out.println("InvalidCourseException: " + e.getMessage());
            }
            finally {
                System.out.println("Checked");
            }
        }
        scanner.close();
    }
}
