public class FineNumber {
public static int findFineNum(int a[], int b[], int n, int m){
    int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE;
    int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        maxA = Math.max(maxA, a[i]);
        minA = Math.min(minA, a[i]);
    }
    for(int i=0;i<m;i++){
        maxB = Math.max(maxB, b[i]);
        minB = Math.min(minB, b[i]);
    }
    return (int)Math.max(Math.abs(maxA-minB), Math.abs(maxB-minA));
}
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {10,12,34,2,4,89};
        int n=a.length,m=b.length;
        System.out.println(findFineNum(a, b, n,m));
    }
}
