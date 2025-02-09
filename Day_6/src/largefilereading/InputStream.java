package src.largefilereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public void readFile(String filePath) {
        try {
            long startTime = System.currentTimeMillis();

            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
            while (reader.read() != -1) { }  // Reading byte stream and converting to characters

            reader.close();

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
