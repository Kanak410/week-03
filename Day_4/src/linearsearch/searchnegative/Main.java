package linearsearch.searchnegative;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the  array");
        int arr []=new int [n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Negative obj=new Negative();
        int a=obj.negativeNum(arr);
        System.out.println(a);

    }
}
