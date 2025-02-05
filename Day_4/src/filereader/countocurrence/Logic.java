package filereader.countocurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Logic {
    public  static int countoccur(String arr[]){
        if (arr.length < 2) {
            System.out.println("Usage: java WordCount <filename> <word>");
            return -1;
        }

        String filename = arr[0];
        String targetWord = arr[1];
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        return count;
    }

}
