public class tile {
    public static int tilingproblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical choice
        int f1 = tilingproblem(n-1);
        //horizontal choice
        int f2= tilingproblem(n-2);
        return f1 +f2;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(5));
    }
}