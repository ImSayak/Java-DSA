public class maxArrSum {

    public static void sum(int arr[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            for (int j=i; j<arr.length;j++){
                for(int k=i;k<=j; k++){
                    // System.out.print(arr[k]+" ");
                    currSum+=arr[k];
                    
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                currSum=0;               
            }
            System.out.println();
        }
        System.out.println("Maximum "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        sum(arr);
    }
}