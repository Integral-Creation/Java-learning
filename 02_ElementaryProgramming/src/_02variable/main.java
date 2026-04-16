package _02variable;

public class main {
    public static void main(userDataString[] args){
        /*
            variable:A variable is a named memory location used to store data.
                primitive  reference
                 int        string
                 double     array
                 char       object
                 float
                 boolean
        */

        // int variable
        int age; // variable declaration
        age = 20; // variable assignment
        System.out.println(age);

        int year = 2026;
        System.out.println("the year is "+year);

        // double variable
        double price = 19.99;
        System.out.println(price);

        double temp = -12.34;
        System.out.println(temp);

        // char variable
        char grade = 'A';
        System.out.println(grade);

        // boolean variable
        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = false;

        System.out.println(isStudent);
        System.out.println(isOnline);
        System.out.println(forSale);

        if(isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student");
        }

        // string reference
        java.lang.String name = "tesla";
        System.out.println("hello "+name);

        java.lang.String food = "rice";
        System.out.println("your favourite food is "+food);

    }
}
