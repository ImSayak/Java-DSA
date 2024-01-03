public class Matrix_column_sum {
    public static void columSum(int arr[][]){
        int sum;
        for(int j=0;j<arr[0].length;j++){
            sum = 0;
            for(int i=0;i<arr.length;i++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4},{5,6},{7,8}};
        columSum(arr);
    }
}
