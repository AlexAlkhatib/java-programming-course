package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sample.txt");
        FileReader reader = new FileReader(file);
    }
}