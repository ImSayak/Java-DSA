import java.util.*;
public class largestNum {
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){            
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
    }
    public static void main(String args[]) {
        int numbers[]={5,9,4,3,10,5,7};
        System.out.print("Largest value os "+findLargest(numbers));
    }
    
}