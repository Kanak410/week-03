package sortingalgo.selectionsort;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create scanner type object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of student: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  score: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SortScore op=new SortScore();
        op.sortexam(arr);
        System.out.println("Sorted Exam Scores: ");
        System.out.println(Arrays.toString(arr));
    }
}
