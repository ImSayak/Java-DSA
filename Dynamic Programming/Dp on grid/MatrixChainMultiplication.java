import java.util.Arrays;

public class MatrixChainMultiplication {
    //Recurrsion
    public static int mcm(int arr[], int i, int j){
        if(i==j) return 0; //For Single Matrix result 0
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1= mcm(arr,i,k);  // Ai....Ak => arr[i-1]*arr[k]
            int cost2= mcm(arr,k+1,j);// Ak+1...Aj => arr[k]*arr[j]
            int cost3= arr[i-1]*arr[k]*arr[j];//a*b*d
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    //Memoization
    public static int mcm2(int arr[],int i,int j, int dp[][]){
        if(i==j) return 0;
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        else{
            for(int k=i;k<j;k++){
                int cost1 = mcm2(arr,i,k,dp);
                int cost2 = mcm2(arr,k+1,j,dp);
                int cost3 = arr[i-1]*arr[k]*arr[j];
                int finalCost = cost1+cost2+cost3;
                ans = Math.min(finalCost,ans);
            }
        }
        return dp[i][j] = ans;
    }
    //Tabulation
    public static int mcm3(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];
        //initialization
        for(int i=0;i<n;i++){
            dp[i][i] =0;
        }
        //bottom up
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j = i+len-1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    int finalCost = cost1+cost2+cost3;
                    dp[i][j] = Math.min(dp[i][j],finalCost);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3};
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(mcm(arr,1,n-1));
        System.out.println(mcm2(arr,1,n-1,dp));
        System.out.println(mcm3(arr));
    }    
}