public class checkEvenOrOdd {

    public static void evenOrOdd(int n) {
        // int bitMask=1; //1<<0
        //if((n & bitMask) == 1){
        if((n & 1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(9);
        evenOrOdd(15);
        evenOrOdd(22);
    }
}