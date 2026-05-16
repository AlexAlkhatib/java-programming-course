package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // code that may throw an exception
            File file = new File("sample.txt");
            FileReader reader = new FileReader(file);
        }
        catch (FileNotFoundException e) {
            // code that deals with exception
            System.out.println("File not found");
        }
        finally {
            // code that will always be executed
            System.out.println("Done!");
        }
    }
}