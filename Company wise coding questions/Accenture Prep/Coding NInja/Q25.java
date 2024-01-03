// 25. Execute a function that accepts the integer array of length ‘size’ and finds out the maximum number that can be formed by permutation.
// Note: You will have to rearrange the numbers to make the maximum number.

// Example
// Input:
// 34 79 58 64
// Output:
// 98765443

// Explanation
// All digits of the array are 3, 4, 7, 9, 5, 8, 6, and 4. The maximum number found after rearranging all the digits is 98765443.
 
import java.util.*;

public class Q25 {
    public static int lagreNumber(int arr[]){
       Arrays.sort(arr);
       int num=0;
       for(int i=arr.length-1;i>=0;i--){
        num = num*10+arr[i];
       }
       return num;
    }
    
    public static void main(String args[]){
        int arr[] = {3,4,7,9,5,8,6,4};
        System.out.println(lagreNumber(arr));
    }
}
