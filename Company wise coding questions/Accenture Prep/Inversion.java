public class Inversion {
    public static int InversionCount(int A[], int n){
        int count =0;
        if(n<2) return 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int A[] = {1,20,6,4,5};
        int n = A.length;
        System.out.println(InversionCount(A, n));
    }
}
