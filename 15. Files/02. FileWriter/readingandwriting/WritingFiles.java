package readingandwriting;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        // true -> to open the file in append mode
        try (FileWriter writer = new FileWriter("file.txt", true)) 
        {
            writer.write("Hi, there!\n");
        }
        catch (IOException e) {
            // e.getClass() -> FileNotFoundException
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}