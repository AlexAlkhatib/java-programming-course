package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // try with resource
        try (FileReader reader = new FileReader("sample.txt")) {}
        catch (FileNotFoundException e) {
            // code that deals with exception
            System.out.println("File not found");
        }
        catch (IOException e) {
            // catch another exception
            System.out.println("IO problem");
        }
        // finally block is no longer needed for cleaning up
        // finally {
        //    System.out.println("Done!");
        // }
    }
}