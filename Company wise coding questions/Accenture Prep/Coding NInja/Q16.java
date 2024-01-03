// 16. In a given list of integers, find the number that has the highest frequency.
//If there are one or more such numbers, give the smaller one as output.
// Input:
// 3
// 7
// 2 4 5 2 3 2 4
// 6
// 1 2 1 1 2 1
// 10
// 1 1 1 1 1 1 1 1 1 1

// Output:
// 2
// 1
// 1

import java.util.Arrays;

public class Q16 {
    public static int findHighestFreqNum(int arr[]){
        // int maxCount = 0;
        // int highestFreqNum=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     int count =0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i] == arr[j]) count++;
        //     }
        //     if(count>maxCount){
        //         maxCount = count;
        //         highestFreqNum = arr[i];
        //     }
        //     else if(maxCount==count){
        //         highestFreqNum = Math.min(highestFreqNum, arr[i]);
        //     }
        // }
        // return highestFreqNum;

        //Optimized
        int maxCount=0;
        int highestFreqNum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            int count=0;
            while(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(maxCount<count){
                maxCount=count;
                highestFreqNum=arr[i];
            }else if(maxCount == count) Math.min(highestFreqNum,arr[i]);
          i++;
        }
        return highestFreqNum;
    }
    public static void main(String args[]){
        int arr[] = {1, 1, 2, 2, 4, 5, 3, 2, 4};
        System.err.println(findHighestFreqNum(arr));
    }
}