public class SearchInRotatedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        //base case
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2;
        //case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        //mid in L1
        if(arr[si] <= arr[mid]){
            //case a: L1 Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case b: mid Right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid in L2
        else{
            //case c: L2 Right
            if(arr[mid]<= tar && tar<= ei){
                return search(arr, tar, mid+1, ei);
            }
            //cse d: mid Left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int target= 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
