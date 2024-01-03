public class Q22 {
    public static int totalMoney(int n){
        int total = 0;
        for(int i=1;i<=n;i++){
            total += Math.pow(i, 2);
        }
        return total;
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalMoney(n));
    }
}
