public class get_ith_bit {
    public static void GetithBit(int n, int i) {
        int bitMask=1<<i;
        if((n & bitMask)==0){
            System.out.println("ith value is 0");
        }
        else{
            System.out.println("ith value is 1");
        }
    }
    public static void main(String[] args) {
        GetithBit(10, 3);
    }
}
