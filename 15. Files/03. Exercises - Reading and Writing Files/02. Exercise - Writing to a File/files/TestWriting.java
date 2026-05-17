package files;

import java.io.FileNotFoundException;

public class TestWriting {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String[] names = {"Alex", "Bob", "Charlie"};

        try {
            WriteToFile.writeNames(fileName, names);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}