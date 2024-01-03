import java.util.Scanner;
public class prep1{
    public static int countOddEvenDifference(int n, int arr[]){
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) countEven++;
            else countOdd++;
        }
        return countOdd-countEven;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countOddEvenDifference(n, arr));
    }
}