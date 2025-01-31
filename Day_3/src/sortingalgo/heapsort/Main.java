package sortingalgo.heapsort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of job applicants: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  salary: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SortJob ob=new SortJob();
        ob.heapSort(arr);

        // Output: Sorted salaries
        System.out.println("Sorted Salary Demands (Ascending Order):");
        System.out.println(Arrays.toString(arr));


    }
}
