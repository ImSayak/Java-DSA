public class MagicNumber {
    //magic number --> perfect square
    public static int findMagicNumber(int n, int arr[]){
        int countMagicNumber=0;
        for(int i:arr){
            int num = (int)Math.sqrt(i);
            if(num*num == i) countMagicNumber++;
        }
        return countMagicNumber;
    }

    public static void main(String[] args) {
        int arr[] = {0,25,77,54,81,48};
        System.out.println(findMagicNumber(arr.length, arr));
    }
}
