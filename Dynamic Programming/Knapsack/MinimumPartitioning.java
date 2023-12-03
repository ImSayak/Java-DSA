public class MinimumPartitioning {
    //O(n*W)
    public static int minPartition(int num[]){
        int n = num.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += num[i];
        }

        //0-1 Knapsack
        int W = sum/2; //capacity of set1
        int dp[][] = new int[n+1][W+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(num[i-1]<=j){//valid
                    //include
                    int inc = num[i-1]+dp[i-1][j-num[i-1]];
                    //exclude
                    int exc = dp[i-1][j];
                    dp[i][j] = Math.max(inc,exc);
                }else{//invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2= Math.abs(sum-dp[n][W]);
        return Math.abs(sum2-sum1);
    }

    public static void main(String[] args) {
        int num[] ={1,6,11,5};
        System.out.println(minPartition(num));
    }    
}