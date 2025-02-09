package src.stringconcatenation;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 10000;  // Adjust size for testing
        int[] arr = new Random().ints(n, 1, 100000).toArray();

        long start, end;
        start = System.nanoTime();
        StringC.stringConcatenation(n);
        end = System.nanoTime();
        System.out.println("String Concatenation Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilderC.stringBuilderConcatenation(n);
        end = System.nanoTime();
        System.out.println("StringBuilder Concatenation Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBufferC.stringBufferConcatenation(n);
        end = System.nanoTime();
        System.out.println("StringBuffer Concatenation Time: " + (end - start) / 1e6 + " ms");
    }
}
