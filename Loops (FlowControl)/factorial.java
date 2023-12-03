import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int fact = 1;

        for(int i=1; i<number; i++){
          fact = fact*i;        
        }
        System.out.println("Factorrial of this number is: "+ fact);

    }
}
 