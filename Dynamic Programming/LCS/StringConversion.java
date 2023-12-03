public class StringConversion {
    public static int lcs(String str1, String str2){
        int n= str1.length();
        int m = str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1; i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static int stringConverter(String str1, String str2){
        int ans = lcs(str1,str2);
        return ((str1.length()-ans)+(str2.length()-ans));
    }
    public static void main(String[] args) {
        String str1 ="abcdef";
        String str2 ="aceg";
        System.out.println(lcs(str1,str2));
        System.out.println(stringConverter(str1,str2));
    }
}
