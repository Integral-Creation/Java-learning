package _02FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
File Handling:
    File handling in java is used to create, read, write and delete files stored on the computer.

    How to write a file using Java: 
        • FileWriter -> Good for small or medium sized text files
        • BufferWriter -> Better performance for large amounts of text
        • PrintWriter -> Best for binary files
        • FileOutputStream -> Best for binary files (e.g. images, audio files)
*/
public class _01write {
    public static void main(String[] args) {
        String filePath = "D:\\VScode\\JAVA\\13_ExceptionHandlingAndTextInput&Output\\src\\_02FileHandling\\text.txt";

        String textContent = """
                If you are not having fun, you're not learning. There's is joy in learning things out.
                -Richard Feynman
                There is no shame in not knowing things! The only shame is to pretend that we know everything.
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate the file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }    
}
