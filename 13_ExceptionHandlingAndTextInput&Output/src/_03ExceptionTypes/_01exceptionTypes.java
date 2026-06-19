package _03ExceptionTypes;

/*
    Types of Exception
        In java, exception are broadly divided into two main types:
            • Compile time Exception (Checked Exceptions)
            • Runtime Exception (Unchecked Exceptions)
*/

/*
Exception
    │
    ├── UserDefinedException
    │
    └── BuiltInException
            │
            ├── CheckedException (CompileTime Exception)
            │        ├── ClassNotFoundException
            │        ├── InterruptedException
            │        ├── IOException
            │        ├── InstantiationException
            │        ├── SQLException
            │        └── FileNotFoundException
            │
            └── UncheckedException (Runtime Exception)
                     ├── ArithmeticException
                     ├── NullPointerException
                     ├── ArrayIndexOutOfBoundsException
                     ├── ClassCastException
                     └── IllegalArgumentException
*/

/**
 * Checked Exception (Compile time Exceptions)
    these exceptions are checked by the compilers.
        • Handle the exceptions with try-catch block or
        • Declare them using throws
    ex-
        IOException
        FileNotFoundException
        SQLException
        ClassNotFoundException
        
*/

/**
 * Unchecked Exception (Runtime Exception)
    Occurs at the runtime. They are subclass of RuntimeException
        Ex-
            ArithmeticException
            NullPointerException
            ArrayIndexOutOfBoundException
            NumberFormatException
*/

public class _01exceptionTypes {
    
}

