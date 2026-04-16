package _03input;
import java.util.Scanner;

public class main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        /*
        next()
            Reads one word (token)
            Stops at whitespace (space, tab, newline)
        */
        System.out.print("enter your name:");
        String name = scanner.next();

        /*
        nextLine()
            read entire line
            stops only when enter is pressed
        */

        // input message or statement
        System.out.println("enter your message: ");
        String message = scanner.nextLine();

        // input integer
        System.out.print("enter your age: ");
        int age = scanner.nextInt(); // int method

        // input double
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble(); // double method

        // boolean method
        System.out.print("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello "+ name);
        System.out.println("Your message is: "+message);
        System.out.println("you are "+age+" year old");
        System.out.println("your GPA is:"+gpa);

        // checking for enrollment
        if(isStudent){
            System.out.println("You are enrolled as a student.");
        }
        else{
            System.out.println("You are not enrolled.");
        }





        scanner.close();
    }
}
