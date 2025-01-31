package sortingalgo.insertionsort.sortemployeeid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // create scanner type object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of employee: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter  id of employee: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        //create object to call method
        SortEmployee obj=new SortEmployee();

        int  [] a=obj.sortEmployeeI(arr);
        for(int i:a){
            System.out.println(i);
        }
    }
}
