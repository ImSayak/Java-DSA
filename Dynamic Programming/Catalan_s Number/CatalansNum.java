import java.util.Arrays;

public class CatalansNum {
    //Recursion
    public static int catalanNum(int n) {
        if (n == 0 || n == 1)
            return 1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalanNum(i) * catalanNum(n - i - 1);
        }
        return ans;
    }

    // Memoization
    public static int catalanMem(int n, int dp[]) {
        if (n == 0 || n == 1)
            return 1;
        int ans = 0;
        if (dp[n] != -1)
            return dp[n];
        else {
            for (int i = 0; i < n; i++) {
                ans += catalanMem(i, dp) * catalanMem(n - i - 1, dp);
            }
            return dp[n] = ans;
        }
    }
    //Tabulation O(n^2)
    public static int catalanTabu(int n){
        int dp[] = new int[n + 1];
        dp[0]=dp[1] =1; // initialize
        
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(catalanNum(n));
        System.out.println(catalanMem(n, dp));
        System.out.println(catalanTabu(n));
    }
}