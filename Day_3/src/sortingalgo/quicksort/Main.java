package sortingalgo.quicksort;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create scanner type object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of product: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  price: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
            Product sorter = new Product();
            sorter.quicksort(arr, 0, n - 1);
            System.out.println("Sorted Product Prices:");
            System.out.println(Arrays.toString(arr));


    }
}
