import java.util.Scanner;

public class Fibonacci_Numbers {
    public static int findNthFibonacci(int num){
        if(num<=1) return num;
        return findNthFibonacci(num-1)+findNthFibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findNthFibonacci(n));
    }

}
