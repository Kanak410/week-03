package stackAndQueue.stockPlan;
import java.util.Random;

import static stackAndQueue.stockPlan.Stock.getStockSpan;

public class Main {
    public static void main(String[] args) {
        Random input=new Random();
        int n= input.nextInt();
        int [] stock=new int[n];
        for(int i=0;i<n;i++){
            stock[i]= input.nextInt();
        }
        int [] ans=getStockSpan(stock);
        for (int an : ans) {
            System.out.println(an);
        }



    }
}
