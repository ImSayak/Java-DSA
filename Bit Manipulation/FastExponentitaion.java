public class FastExponentitaion {
    public static int fExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1) == 1){//check LSB
                ans *= a;
            }
            a= a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fExpo(3, 5));
    }
}
//Time Complexity --> log(n)