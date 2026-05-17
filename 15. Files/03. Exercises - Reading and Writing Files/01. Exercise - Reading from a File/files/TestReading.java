package files;

import java.io.FileNotFoundException;

public class TestReading {
    public static void main(String[] args) {
        String fileName = "input.txt";
        try {
            ReadFromFile.readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}