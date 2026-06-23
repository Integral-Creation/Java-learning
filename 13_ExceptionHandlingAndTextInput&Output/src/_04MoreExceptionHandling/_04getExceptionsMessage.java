package _04MoreExceptionHandling;

/*
    • when an exceptions occurs, Java creates an objects that contains information about error. 
        we can retrieve that error message by using following method

    java.lang.Throwable
        +getMessage(): String
        +toString(): String
        +printStackTrace(): void
        +getStackTrace(): StackTraceElement[]
*/

public class _04getExceptionsMessage {
    public static void main(String[] args) {
        /*1• getMessage() */
        try{
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); 
            /* Output:
                / by zero
            */
        }

        /*2• toString: to return the exceptions class name along with message */

        /*3• printStackTrace: Prints the complete exceptions details, including where the error occurred */

        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.toString());
            e.printStackTrace();
            /* Output:
                java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

                java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
                        at _04MoreExceptionHandling._04getExceptionsMessage.main(_04getExceptionsMessage.java:33)                
            */
        }
    }
   
}
