package targetsearch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static targetsearch.Linear Linear;

    public static void main(String[] args) {
        int datasize[]={ 1000,10000,1000000};
        int t=7;
        Random ra=new Random();
        for(int si:datasize){
            int [] arr= new int [si];
            for(int i=0;i<si;i++){
                arr[i]=ra.nextInt();
            }

            // Linear Search
            long startTime = System.nanoTime();
           Linear.search(arr, t);
            long linearTime = System.nanoTime() - startTime;

            // Binary Search
            Arrays.sort(arr);  // Sort the dataset first
            startTime = System.nanoTime();
            Binary.binary(arr, t);
            long binaryTime = System.nanoTime() - startTime;

            System.out.println("Dataset Size: " + si);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms\n");
            System.out.println("--------------------------------");
        }


    }
}
