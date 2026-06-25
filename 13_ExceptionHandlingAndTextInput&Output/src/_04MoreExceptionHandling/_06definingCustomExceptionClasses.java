package _04MoreExceptionHandling;

/*
    Defining Custom Exceptions classes
        java allows you to create your own custom exception classes when built in custom exception doesn't accurately describe the error condition.
        
        To create custom exception:
            • extends the Exception or RunTimeException
                - extends the Exception creates -> checked exception
                - extends the Runtime exceptions creates -> unchecked exception
*/

/** Checked Exceptions */
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class _06definingCustomExceptionClasses {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Eligible to Vote");
    }

    public static void main(String[] args) {
        try{
            checkAge(15);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    /* output:
        Age must be 18 or above
    */
}
