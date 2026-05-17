package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void readFile(String filePath) throws FileNotFoundException {
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}