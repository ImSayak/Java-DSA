import java.util.*;

public class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("This is prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("This is prime number");
            } else {
                System.out.println("This is non prime number");
            }
        }

    }

}
