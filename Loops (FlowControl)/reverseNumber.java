import java.util.*;

public class reverseNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        while(number > 0)
        {   
            int lastDigit = number%10;
            System.out.print(lastDigit+" ");
            number= number/10;
        }
    }
}
