public class CheckANumberPowOf2 {
    public static boolean isPowOf2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowOf2(17));
    }
}
