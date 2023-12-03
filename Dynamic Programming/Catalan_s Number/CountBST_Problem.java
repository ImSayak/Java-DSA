import java.util.Scanner;

public class CountBST_Problem {
    // O(n^2)
    public static int countBST(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1; // intitialize;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int left =dp[j];
                int right =dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println(countBST(n));
    }
}
