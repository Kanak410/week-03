package src.largefilereading;

import java.io.FileReader;
import java.io.*;

public class FileReaderC {
    public void readFile(String filePath) {
        try {
            long startTime = System.currentTimeMillis();

            FileReader reader = new FileReader(filePath); // Using java.io.FileReader
            while (reader.read() != -1) { }  // Reading character by character
            reader.close(); // Close the file after reading

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using FileReader: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
