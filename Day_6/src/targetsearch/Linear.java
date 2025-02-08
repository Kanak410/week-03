package targetsearch;

public class Linear {

    public static int search(int arr[],int t){
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==t){
                ans=i;
            }
        }
        return ans;
    }
}
