import java.util.*;

public class Pallindrome {
    public static boolean isPallindrome(char[] arr){
        char[] arr1 = new char[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            arr1[j] = arr[i];
            j++;
        }
        return Arrays.equals(arr,arr1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        System.out.println(isPallindrome(arr));
    }
}
