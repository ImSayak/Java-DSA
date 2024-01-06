/*Build a program for calculating and returning the sums of absolute differences between adjacent numbers in 
arrays of positive integers. This must be calculated from the position determined by the current user.

In the case of this coding problem, you use three positional arguments through a findTotalSum function. 
The three inputs you would require are the number of elements inside the array, the elements in the array 
and the position from where this function will take place.

For example, suppose the total number of elements is 5 and these are the elements:

1 2 3 6 4

Then, if we decide to start from the 3rd position or enter 3 as input, the function will occur from ‘3’, 
the 3rd number in the array.


Hence, the sum would be a total of (6-3)+(4-6)= 5 */

import java.util.*;
public class ninja1 {
    public static int findTotalSum(int n, int arr[], int start){
        int sum=0;
        int diff;
        for(int i=start-1;i<n-1;i++){
            diff = Math.abs(arr[i] - arr[i+1]);
            sum += diff;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(("Array:"));
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Start point:");
        int start = sc.nextInt();
        System.out.println(findTotalSum(n, arr, start));
    }
}
