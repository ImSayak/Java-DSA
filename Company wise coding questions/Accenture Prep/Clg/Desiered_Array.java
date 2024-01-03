import java.util.Scanner;

public class Desiered_Array {
    public static int DesieredArray(int[] arr, int n, int k){
        int num = 1;
        int count = 0;
        int sum = 0;
        while(count != k){
            int i=0;
            for(;i<n;i++){
                if(num % arr[i] == 0) break;
            }
            if(n==i){
                sum += num;
                count++;
            }
            num++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[]= new int [n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Result: "+ DesieredArray(arr, n, k));
    }
}
