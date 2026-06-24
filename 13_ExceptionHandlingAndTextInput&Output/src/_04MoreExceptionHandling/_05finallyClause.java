package _04MoreExceptionHandling;

/*
    finally Clause:
        finally block is used with the try and catch to execute the code regardless of whether an exception occurs or not.

        Syntax:
            try{
                // risky code
            } catch{
                // exceptions handling
            } finally {
                // always executes
            }
*/

public class _05finallyClause {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the try block");
        } finally{
            System.out.println("Inside the finally block");
        }
    }
        /*
        Inside the try block
        Inside the finally block
        */
}
