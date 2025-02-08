package targetsearch;

public class Binary {
    public static int binary(int arr[],int t){
        int ans=-1;
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
