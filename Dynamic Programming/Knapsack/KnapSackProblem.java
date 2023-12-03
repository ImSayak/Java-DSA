public class KnapSackProblem {
    // Memoization
    public static int knapsack(int val[],int wt[], int W, int n, int dp[][]){
        if(W==0 || n==0) return 0; // Base Case

        if(dp[n][W] != -1) return dp[n][W]; // if present return this value
        if(wt[n-1]<=W){ //Valid
            //include
            int ans1 = val[n-1]+knapsack(val,wt, W-wt[n-1] ,n-1, dp);
            //exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2); // Return Maximum value with include or exclude
            return dp[n][W];
        }else{ // Not Valid
            dp[n][W] = knapsack(val, wt, W, n-1,dp);
            return dp[n][W];
        }
    }
    public static void printDp(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Tabulation
    public static int knapsackTabu(int val[], int wt[], int W){
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
                    int incProfit = v + dp[i-1][j-w];
                    //exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else{//invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        System.out.println("\nTabulation: ");
        printDp(dp);
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
        System.out.println("Memoization: \n"+knapsack(val, wt, W, val.length,dp));
        printDp(dp);
        System.out.println(knapsackTabu(val, wt, W));
    }
}
