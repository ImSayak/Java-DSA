/*Build a program that will allow you to find out how many clothing pieces in total of a certain length 
can be extracted from a particular number of cloth pieces. We can take the required length for each 
clothing piece as 10 feet.

In this case, we must first decide upon the length unit as feet and determine the inputs we need. 
For this function, we will need two inputs, first the number of pieces ( in the array) and the size 
of each piece in feet inside the array. 

A cloth merchant has some pieces of cloth of different lengths. He has an order of curtains of length 12 feet.
He has to find how many curtains can be made from these pieces. Length of pieces of cloth is recorded in feet. 

For example, suppose the total number of elements is 3 and these are the elements:

0 10 40

Then, the first input is 3 followed by the second input of 0, 10 and 40.

Hence, the sum would be a total of 0 + (10/10) + (40/10) = 5

Thus, there could be 5 pieces of clothing extracted from these 3 pieces of cloth of variable sizes. */

import java.util.Scanner;

public class ninja2 {
    
    public static int findTotalPieces(int n, int arr[]){
        int numberOfPices=0;
        for(int i=0;i<n;i++){
            int numberOfPicesPerElement = 0;
            if(arr[i]>=10){
                numberOfPicesPerElement = arr[i]/10;
            }
            numberOfPices += numberOfPicesPerElement;
        }
        return numberOfPices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pices: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("There could be "+  findTotalPieces(n, arr) +" pieces of clothing extracted");
    }
}
