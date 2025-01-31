package stackAndQueue.stockPlan;
import java.util.Stack;
public class Stock {
   public static int[] getStockSpan(int [] a){
      int []ans=new int[a.length];
      Stack<int[]>s=new Stack<>();
      for(int i=0;i<a.length;i++){
        if(s.isEmpty()) {
            s.push(new int[]{a[i],1});
            ans[i]=1;

        }
        else{
            if(s.peek()[0]>a[i]){
                s.push(new int[]{a[i],1});
                ans[i]=1;
            }
            else{
                int count=1;
                while (s.peek()[0] <= a[i]) {
                    count+=s.peek()[1];
                    s.pop();
                }
                s.push(new int[]{a[i],count});
                ans[i] = count;
            }
        }
      }
       return ans;
   }

}
