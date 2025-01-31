package sortingalgo.quicksort;

public class Product {
    public void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotindex=sortprice(arr,low,high);
            quicksort(arr, low, pivotindex-1);
            quicksort(arr, pivotindex+1, high);
        }
    }

    public int sortprice(int arr[],int low,int high){

            int pivot=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    swap(arr,i,j);

                }
            }
            swap(arr,i+1,high);
            return i+1;


    }
    public void swap(int arr[],int k,int p){
        int temp=arr[p];
        arr[p]=arr[k];
        arr[k]=temp;
    }

}
