public class set_ith_bit {

    public static void SetithBit(int n, int i) {
        int bitMask=1<<i;
            System.out.println(n | bitMask);
    }
    public static void main(String[] args) {
        SetithBit(10, 2);
    }
}