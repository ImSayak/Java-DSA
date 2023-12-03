public class SumOfNaturalNumbers {
    public static int SumNnum(int n){
        if(n==1){
            return 1;
        }
        return n+SumNnum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumNnum(10));
    }
}
//Time and Space Complexity O(n)
