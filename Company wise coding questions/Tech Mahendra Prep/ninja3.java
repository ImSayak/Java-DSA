public class ninja3 {
    public static int calculateTotalInterest(int n, int arr[]){
        int totalInterest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>2000){
                totalInterest += (int)(arr[i]*0.2);
            }    
        }
        return totalInterest;
    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = {2000,4000,6000,8000,10000};
        System.out.println(calculateTotalInterest(n, arr));
    }
}
