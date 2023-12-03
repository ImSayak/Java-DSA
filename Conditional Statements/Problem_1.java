//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;
public class Problem_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        float number = sc.nextFloat();

        if(number<0){
            System.out.println("Your number is negative");
        }
        else{
            System.out.println("Your number is positive");
        }
    }
}
