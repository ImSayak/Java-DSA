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
