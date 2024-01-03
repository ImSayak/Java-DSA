import java.util.*;
public class Q17 {
    public static void mergeArrays(int a[], int b[], int asize, int bsize){
        int res[] = new int[asize+bsize];
        System.arraycopy(a, 0, res, 0, asize);
        System.arraycopy(b,0,res,asize,bsize);

        Arrays.sort(res);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={1,3,4,6};
        int b[]={2,7,8,9,10};
        mergeArrays(a, b, a.length, b.length);
    }
}
