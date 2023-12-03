public class UnboundedKnapsack {
        public static int knapsackUnbound(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length;i++){ //initialize
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){//valid
                    //include
                    int incProfit = v + dp[i][j-w]; //instade of (i-1) item we use i
                    //exclude                       //Because we can add  ith item again
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else{//invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1]; //2D array for memoization
        for(int i=0; i<dp.length;i++){//initialize with -1
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsackUnbound(val, wt, W));
    }
}
