import java.util.*;
public class solve {
    public static void findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        int count;
        int res[] = new int[2];
        for(int i=0;i<=arr[n-1];i++){
            count=0;
            for(int j =0;j<n;j++){
                if(i==arr[j]) count++;
            }
            if(count>1) res[0] = i;
            else if(count== 0){
                res[1] = i;
                if(res[1] == 0) res[1] = arr[n-1]+1;
            }
        }
        System.out.println(res[0]+","+res[1]);
    }
    public static void main(String[] args) {
        int array[] = {0,3,2};
        findTwoElement(array, array.length);
    }
}
