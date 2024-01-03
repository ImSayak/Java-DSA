import java.util.Collections;
import java.util.TreeSet;

public class Second_Largest {
    public static int secondLargest(int arr[]){
        TreeSet<Integer> map = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            map.add(arr[i]);
        }
        if(map.size()<=1) return Integer.MIN_VALUE;
        else {
            map.pollFirst();
            return map.pollFirst();
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,9,0,9};
        System.out.println(secondLargest(arr));
    }
}
