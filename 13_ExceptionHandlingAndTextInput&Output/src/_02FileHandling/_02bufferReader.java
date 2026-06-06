package _02FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _02bufferReader {
    public static void main(String[] args) {
        String filePath = "D:\\MyFolder\\Programming\\Java\\Java-learning\\13_ExceptionHandlingAndTextInput&Output\\src\\_02FileHandling\\text2.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file");
        } catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
