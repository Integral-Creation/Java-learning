package _02ExceptionHierarchy;

/*
    • Java Exception Hierarchy
        In java, all exception and error are subclass of the throwable class. it has two main branches
            1• Exception
            2• Error
        
Object
   │
Throwable
   ├── Error
   │     ├── OutOfMemoryError
   │     └── StackOverflowError
   │
   └── Exception
         ├── RuntimeException
         │     ├── ArithmeticException
         │     ├── NullPointerException
         │     ├── ArrayIndexOutOfBoundsException
         │     └── IllegalArgumentException
         │
         ├── IOException
         ├── SQLException
         └── ClassNotFoundException

    Exceptions throws are instances of the Throwable classes.
*/
public class _01ExceptionHierarchy {
    
}
