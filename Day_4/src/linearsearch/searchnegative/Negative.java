package linearsearch.searchnegative;

public class Negative {
    public int negativeNum(int [] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
}
