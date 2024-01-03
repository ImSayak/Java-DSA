import java.util.*;

public class Q28 {
    public static void findRoot(int a, int b, int c){
        double innerOpt= Math.abs(b*b - 4*a*c); 
        double numerator1 = -b +Math.sqrt(innerOpt);
        double numerator2 = -b-Math.sqrt(innerOpt);
        double denominator = 2*a;
        double ans1 = numerator1/denominator;
        double ans2 = numerator2/denominator;
        System.out.println(ans1+","+ans2);
    } 
    public static void main(String[] args) {
        int a=1,b=-7,c=10;
        findRoot(a, b, c);
    }
}
