import java.util.Scanner;
public class Leaders_Array {
    public static void leadersArray(int arr[]){
        int j;
        for(int i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]) break;
            }
            if(j==arr.length){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leadersArray(arr);
    }
}
