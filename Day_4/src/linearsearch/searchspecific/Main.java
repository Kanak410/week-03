package linearsearch.searchspecific;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the  array");
        String arr []=new String [n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("enter the  specific word");
        String word=sc.next();
       String result= Specific.searchelement(arr,word);
       System.out.println(result);
    }
}
