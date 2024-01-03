public class faceprep5{
    public static int findMaxDifference(int n,int arr[]){
        int diff= Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            diff = Math.max(arr[i-1]-arr[i], diff);
        }
        return diff;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,11,7,12,14};
        System.out.println(findMaxDifference(n, arr));
    }
}