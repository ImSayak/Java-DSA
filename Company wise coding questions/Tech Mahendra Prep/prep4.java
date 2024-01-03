public class prep4 {
    public static int findTotalCurtains(int n, int arr[]){
        int totalNum=0;
        for(int i=0;i<n;i++){
            int num=0;
            if(arr[i]>=12) num = arr[i]/12;
            totalNum += num;
            System.out.println(num);
        }
        return totalNum;
    }
    public static void main(String[] args){
        int n = 5;
        int arr[] = {3,42,60, 6,14};
        System.out.println(findTotalCurtains(n, arr));
    }
}
