public class SmallNumber {
    public static int[] NextSmallNumber(int a[], int m){
        for(int i=0; i<m-1;i++){
            boolean ischange = false;
            for(int j=i+1;j<m;j++){
                if(a[i]>a[j]){
                    ischange = true;
                    a[i] = a[j];
                    break;
                }
            }
            if(ischange == false) a[i]=-1;
        }
        a[m-1]= -1;
        // for(int i=0;i<m;i++){
        //     System.out.print(a[i]+" ");
        // }
        return a;
    }

    public static void main(String args[]){
        int a[] = {3,2,11,7,6,5,6,1};
        int m = a.length;
        int arr[] = NextSmallNumber(a,m);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
