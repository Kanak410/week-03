package sortingalgo.insertionsort.sortemployeeid;

public class SortEmployee {
    // main method of sorting
    public int [] sortEmployeeI(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }

}
