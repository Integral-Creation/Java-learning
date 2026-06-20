package _04MoreExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

/*
    Declaring Exceptions
        Specifying which checked Exceptions a method may throws. This is done using the throws keyword in the method declaration.

    Syntax:
        returnType methodName(parameters) throws ExceptionsType1, ExceptionsType2{
            // method body
        }
*/
public class _01declaringException {
    public static void readFile() throws IOException{
        FileReader file = new FileReader("data.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        }catch (IOException e){
            System.out.println("File error occurred");
        }
    }
}