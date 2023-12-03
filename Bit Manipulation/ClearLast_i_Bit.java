public class ClearLast_i_Bit {

    public static void ClearBit(int n, int i){
        int bitMask= -1<<i;
        System.out.println(n&bitMask);
    }
    public static void main(String[] args) {
        ClearBit(15, 2);
    }
}