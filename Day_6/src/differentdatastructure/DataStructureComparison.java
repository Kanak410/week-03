package src.differentdatastructure;

import java.util.Random;

public class DataStructureComparison {
    public static void main(String[] args) {
        int N = 1_000_000;  // Change dataset size as needed
        int[] arr = new int[N];
        Random ran = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = ran.nextInt(N);  // Generate random numbers
        }

        int key = arr[ran.nextInt(N)];  // Pick a random key to search

        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch(arr);
        TreeSetSearch treeSetSearch = new TreeSetSearch(arr);

        // Array Search
        long startTime = System.currentTimeMillis();
        boolean foundArray = arraySearch.search(arr, key);
        long endTime = System.currentTimeMillis();
        System.out.println("Array Search: Found = " + foundArray + ", Time = " + (endTime - startTime) + "ms");

        // HashSet Search
        startTime = System.currentTimeMillis();
        boolean foundHashSet = hashSetSearch.search(key);
        endTime = System.currentTimeMillis();
        System.out.println("HashSet Search: Found = " + foundHashSet + ", Time = " + (endTime - startTime) + "ms");

        // TreeSet Search
        startTime = System.currentTimeMillis();
        boolean foundTreeSet = treeSetSearch.search(key);
        endTime = System.currentTimeMillis();
        System.out.println("TreeSet Search: Found = " + foundTreeSet + ", Time = " + (endTime - startTime) + "ms");
    }
}
