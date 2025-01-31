package sortingalgo.bubblesort.studentmarks;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  array: ");
        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();

        }

        int [] a=SortStudent.sortStudentMarks(arr);
        for(int i:a){
            System.out.println(i);
        }

    }
}
