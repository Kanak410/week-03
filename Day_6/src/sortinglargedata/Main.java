package src.sortinglargedata;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 10000;  // Adjust size for testing
        int[] arr = new Random().ints(n, 1, 100000).toArray();

        long start, end;

        // Sorting Performance
        start = System.nanoTime();
        Bubble.bubble(arr.clone());
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Merge.mergeSort(arr.clone(), 0, arr.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Quick.quickSort(arr.clone(), 0, arr.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) / 1e6 + " ms");
    }

    }
