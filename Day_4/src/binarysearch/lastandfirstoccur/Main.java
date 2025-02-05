package binarysearch.lastandfirstoccur;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,5,5,5,6,6,8,9,9,9};
        int l=0;
        int r=arr.length;
        int t=5;
        int res= OccurenceCheck.lastoccurrence(l,r,t,arr);
        int result= OccurenceCheck.occurrence(l,r,t,arr);
        System.out.println(result);
        System.out.println(res);

    }
}
