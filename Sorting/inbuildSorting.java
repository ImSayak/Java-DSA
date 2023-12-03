import java.util.*;
public class inbuildSorting {
    static void printArray(Integer arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        Integer arr[]={6,4,3,2,5};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr, arr.length);
    }
}
