package _04MoreExceptionHandling;

/*
    Throwing exceptions
        it means that explicitly crating and sending an error objects to indicate that an error is occurred or abnormal conditions has occurred.

        or, A program that detects an error can create a instance of an appropriateExceptions type and throw it.

        throw Keyword
            Java use throw keyword for this purpose.
        
        Syntax:
            throw new ExceptionType("Error message");
*/
public class _02throwingExceptions {
    public static void main(String[] args) {
        int age = 15;

        if(age < 18){
            throw new IllegalArgumentException("Not Eligible to Vote");
        }

        System.out.println("Eligible to Vote");
    }
    /*
    Output:
        Exception in thread "main" java.lang.IllegalArgumentException: Not Eligible to Vote
    */
}
