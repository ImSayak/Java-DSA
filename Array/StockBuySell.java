import java.util.*;
public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int buy= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buy < prices[i]){ //profit
                int profit= prices[i] - buy; // today's profit
                maxProfit= Math.max(maxProfit, profit);
            }else{
                buy=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
