public class Factorial {//-----> Time Complexity O(n) and Space Complexity O(n)
    public static int fact(int n){
        if(n==0){
         return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
