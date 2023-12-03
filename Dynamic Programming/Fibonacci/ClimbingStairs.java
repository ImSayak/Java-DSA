import java.util.*;

public class ClimbingStairs {
    //Memoization TC-> O(n) || recursion TC-> O(2^n)
    public static int climbingWays(int n, int ways[]){
        if(n== 0 ) return 1;
        if(n < 0 ) return 0;
        if(ways[n] != -1) return ways[n];
        ways[n] = climbingWays(n-1, ways)+climbingWays(n-2, ways);
        return ways[n];
    }

    // Another variation where 3 jump allowed
    //Tabulation TC->O(n)
    public static int countWays(int n){
        int dp[] = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1) dp[i]=dp[i-1]+0+0;
            else if(i==2) dp[i] = dp[i-1]+dp[i-2]+0;
            else dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        // int ways[] = new int[n+1];
        // Arrays.fill(ways,-1);
        // System.out.println(climbingWays(n, ways)+" Climbing ways ar possible");
        System.out.println(countWays(n)+" Climbing ways ar possible");
    }
}
