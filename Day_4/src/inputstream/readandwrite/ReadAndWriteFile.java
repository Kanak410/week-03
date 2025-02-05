package inputstream.readandwrite;
import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fw = new FileWriter("D:\\week-03\\Day_4\\src\\inputstream\\readandwrite\\output", true);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Input written to output.txt");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

