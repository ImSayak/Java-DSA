/* Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */

import java.util.Scanner;

public class sum_of_OddandEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number,choice,evenSum,oddSum;
        evenSum=0;
        oddSum=0;

        do{
            System.out.println("Enter your number");
            number = sc.nextInt();

            if(number%2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice= sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}
