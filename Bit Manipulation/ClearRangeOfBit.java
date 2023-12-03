public class ClearRangeOfBit {
    public static void ClearRangeOfBiT(int n, int i, int j){
        int a= -1 << (j+1);
        int b= (i<<i)-1;
        int bitMask= a|b;
        System.out.println(n&bitMask);
    }
    public static void main(String[] args) {
        ClearRangeOfBiT(10, 2, 4);
    }
}
