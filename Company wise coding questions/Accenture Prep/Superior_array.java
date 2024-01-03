public class Superior_array {
    public static int FindNumberOfSuperiorElements(int arr[], int n){
        int count =0;
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]) break;
            }
            if(j == n) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,5,2,8,7};
        int n = arr.length;
        System.out.println(FindNumberOfSuperiorElements(arr, n));
    }
}
