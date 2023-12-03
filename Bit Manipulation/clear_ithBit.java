public class clear_ithBit {
    public static void ClearithBit(int n, int i) {
        int bitMask=1<<i;
        System.out.println(n^bitMask);
    }
    // public static void ClearithBit(int n, int i) {
    //     int bitMask= ~(1<<i);
    //     System.out.println(n&bitMask);
    // }
    public static void main(String[] args) {
        ClearithBit(10, 1);
    }
}
