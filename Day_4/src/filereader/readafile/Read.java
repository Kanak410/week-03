package filereader.readafile;
import java.io.*;
public class Read {

        public static void main(String[] args) {
            //file location
            String fileName ="D:\\week-03\\Day_4\\src\\filereader\\readafile\\file ";

            //Create a FileReader object to read from the file.

            try (FileReader fileReader = new FileReader(fileName);

                 // BufferedReader to read line by line
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                //read each line using the readLine() method and print it to the console
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }

}
