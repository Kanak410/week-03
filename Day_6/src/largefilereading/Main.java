package src.largefilereading;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\week-03\\Day_6\\src\\largefilereading\\file.txt";  // Change this to your actual file path

        FileReaderC fileReaderTest = new FileReaderC();
        InputStream inputStreamReaderTest = new InputStream();

        System.out.println("Comparing FileReader and InputStreamReader:");
        fileReaderTest.readFile(filePath);
        inputStreamReaderTest.readFile(filePath);
    }
}
