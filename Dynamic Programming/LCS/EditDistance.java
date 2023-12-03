public class EditDistance {
    //O(n*m)
    public static int editDist(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=j;
        }

        for(int i=1; i<n+1;i++){
            for(int j=1; j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i][j-1]+1,Math.min(dp[i-1][j]+1,dp[i-1][j-1]+1)) ;
                                         //add                  //delete    //replace
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";
        System.out.println(editDist(str1, str2));
    }
}
