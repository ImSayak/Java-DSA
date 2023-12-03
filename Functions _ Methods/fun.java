import java.util.Scanner;

public class fun {
    public static int calculateSum(int a, int b) {
        int sum= a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        calculateSum(x, y);
    }
}