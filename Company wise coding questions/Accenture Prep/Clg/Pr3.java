public class Pr3 {
    public static int ProductOfSums(int arr[], int n){
        int sum1 = arr[0], sum2 =0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]) sum1 += arr[i+1];
            else sum2 += arr[i];
        }
        return sum1*(sum2+arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[] ={3,8,14,12,10,7,4};
        int n = arr.length;
        System.out.println(ProductOfSums(arr,n));
    }
}
