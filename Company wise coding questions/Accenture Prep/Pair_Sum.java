import java.util.Scanner;
import java.util.HashMap;
public class Pair_Sum {
    public static int pairSum(int arr[], int target){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp;
        for(int i=0;i<arr.length;i++){
           temp=target-arr[i];
            if(map.containsKey(temp)) count += map.get(temp);
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = 7;
        System.out.println(pairSum(arr,target));
    }
}
