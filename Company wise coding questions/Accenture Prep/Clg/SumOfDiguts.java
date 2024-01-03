public class SumOfDiguts {
    public static int DiffSumOfDigits(int arr[], int n){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum1 += arr[i]/10;
            sum1 += arr[i]%10;
        }
        for(int i=0; i<n; i++){
            sum2 += arr[i];
        }
        return (sum1%10 )- (sum2%10);
    }

    public static void main(String[] args) {
        int arr[] ={11,14,16,10,9,8,24,5,4,3};
        int n = arr.length;
        System.out.println(DiffSumOfDigits(arr, n));
    }
}
