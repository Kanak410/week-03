package binarysearch.lastandfirstoccur;

public class OccurenceCheck {
    public static int occurrence(int l,int r,int t,int[]arr){
        int ans = -1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid]>=t){
                ans = mid;
                r = mid -1;
            }
            else{
                l=mid+1;
            }
        }
        return  ans;

    }
    public static int lastoccurrence(int l,int r,int t,int[]arr){
        int ans = -1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid]>t){
                ans = mid;
                r = mid -1;
            }
            else{
                l=mid+1;
            }
        }
        return  ans;

    }
}
