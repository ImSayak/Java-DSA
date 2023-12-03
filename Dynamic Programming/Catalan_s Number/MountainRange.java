import java.util.Scanner;

public class MountainRange {
    public static int countMR(int n){
        int dp[] = new int[n+1];
        dp[0]=dp[1] = 1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int inside =dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside*outside;
            }
        }
        return dp[n];
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs: ");
        int n = sc.nextInt();
        System.out.println(countMR(n));
    }
}
