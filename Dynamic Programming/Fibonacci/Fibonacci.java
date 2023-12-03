import java.util.Scanner;

public class Fibonacci{
    public static int fib(int n, int dp[]){
        if(n==0 || n==1) return n;
        //Initially all the array contains 0
        if(dp[n] != 0) return dp[n]; // if the result alredy exist then return the result
        dp[n]= fib(n-1, dp) + fib(n-2, dp); // otherwise re-calculate
        return dp[n];
    }

    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ___th fibonacci you want: ");
        int n = sc.nextInt();
        int dp[] = new int[n+1]; //Memoization --> Create a array for store the reccusion result
        System.out.println(n+"th Fibonacci is: " +fib(n, dp));
        // System.out.println(n+"th Fibonacci is: " +fibTabulation(n));
    }
}