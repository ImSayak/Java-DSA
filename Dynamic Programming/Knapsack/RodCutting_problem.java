public class RodCutting_problem {
    public static int rodCut(int price[],int length[], int rodLength){
        int n= price.length;
        int dp[][]=new int[n+1][rodLength+1];
        // intialize--> all dp[i][0] =0 and all dp[0][i] =0
        // java initialize all rows and column with 0 by default
        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                if(length[i-1]<=j) dp[i][j] = Math.max((price[i-1]+dp[i][j-length[i-1]]), dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int price[]={1,5,8,9,10,17,17,20};
        int length[]={1,2,3,4,5,6,7,8};
        int rodLength = 8;
        System.out.println(rodCut(price,length, rodLength));
    }
}
