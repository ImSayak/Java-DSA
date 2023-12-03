import java.util.Scanner;

public class multiplicationTable {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication table of: ");
        int num = sc.nextInt();
        

        for(int i=1; i<=10; i++){
            int mul = num*i;
            System.out.println(num+"x"+i+"="+mul);
        }
    }
}
