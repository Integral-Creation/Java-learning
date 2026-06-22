package _04MoreExceptionHandling;
/*
    Catching Exceptions
        Catching an Exceptions means handling a runtime error so that the program doesn't terminate abruptly.
        Java uses try-catch block
        
            Syntax:
                try{
                    Statement; // code that may cause an exceptions
                }
                catch (ExceptionsType e){
                    handler for exception1 // code to handle the exceptions
                }
                catch (ExceptionsType e){
                    handler for exception2 // code to handle the exceptions
                }
                catch (ExceptionsType e){
                    handler for exception3 // code to handle the exceptions
                }
*/

public class _03catchingExceptions {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("But Programs Continues!");
        
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    /*
    Output:
        Cannot divide by zero
        But Programs Continues!
        Error: Index 5 out of bounds for length 3
    */
}
