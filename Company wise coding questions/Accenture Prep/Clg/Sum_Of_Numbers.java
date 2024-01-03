public class Sum_Of_Numbers {
    public static int SumPrimeIndices(int arr[], int n){
        int sum = 0;
        for(int i=2;i<n;i++){
            int j=2;
            int count=0;
            while(j<i){
                if(i%j == 0) count++;
                j++;
            }
            if(count<1) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={-1,2,-3,55,51,34,5,-4,66,8,63,45};
        int n = arr.length;
        System.out.println(SumPrimeIndices(arr, n));
    }
}
