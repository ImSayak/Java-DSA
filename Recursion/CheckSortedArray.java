public class CheckSortedArray {
    public static boolean isSort(int arr[],int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,8,5,6,7};
        System.out.println(isSort(arr, 0));
    }
}
