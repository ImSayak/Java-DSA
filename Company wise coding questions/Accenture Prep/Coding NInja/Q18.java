import java.util.*;
public class Q18 {
    public static int findGreatestElement(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int el : arr){
            pq.add(el);
        }
        for(int i=0; i<k;i++){
            pq.poll();
        }
        return pq.poll();
    }
    
    public static void main(String args[]){
        int arr[] = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(findGreatestElement(arr, 0));
    }
}
