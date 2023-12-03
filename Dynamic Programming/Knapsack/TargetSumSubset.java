public class TargetSumSubset {
    // TC = O(n*sum)
    // Using Tabulation
    public static boolean targetSum(int arr[],int sum){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        // i = item & j=target sum
        for(int i=0; i<dp.length;i++){
            dp[i][0] = true;
        }
        // for(int j=0; j<dp[0].length;j++){  //<-- this in not required
        //     dp[0][j]=false;                   //because in Java all are initialize with False
        // }
        for(int i=1; i<n+1;i++){
            for(int j=1; j<sum+1;j++){
                int v = arr[i-1];
                //include
                if(v<=j && dp[i-1][j-v] == true) dp[i][j] =true;   
                //exclude
                else if(dp[i-1][j]==true) dp[i][j]=true;
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int targetSum = 16;
        System.out.println(targetSum(arr, targetSum));
    }
}
