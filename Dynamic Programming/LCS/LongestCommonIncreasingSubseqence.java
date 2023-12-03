import java.util.*;
import java.util.HashSet;
public class LongestCommonIncreasingSubseqence {
    public static int lcs(int arr1[], int arr2[]){
        int n= arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr1[]){
        TreeSet<Integer> set = new TreeSet<>(); //for sort unique elements
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];//sorted unique element
        int i=0;
        for(int num: set){
            arr2[i] = num;
            i++;
        }
        return lcs(arr1,arr2);
    }
    
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};
        System.out.println(lis(arr));
    }
}
