package src.sortinglargedata;

public class Bubble {
    public static void swap(int arr[], int i, int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static int [] bubble(int arr[]){
        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
        return  arr;


    }
}
