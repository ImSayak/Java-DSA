import java.util.*;
public class prep3 {
    public static int findDifference(int n, int arr[]){
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<n;i++){
            if(i%2 == 0) evenSum += arr[i];
            else oddSum+= arr[i];
        }
        return  Math.abs(oddSum - evenSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findDifference(n, arr));
    }
}
