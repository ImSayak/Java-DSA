public class MagicNumber {
    //magic number --> perfect square
    public static int findMagicNumber(int n, int arr[]){
        int countMagicNumber=0;
        for(int i:arr){
            String num = Math.sqrt(i)+"";
            System.out.println(num);
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)=='.' && num.charAt(j+1)=='0' && (j+2== num.length())){
                    countMagicNumber++;
                    break;
                }
            }
        }
        return countMagicNumber;
    }

    public static void main(String[] args) {
        int arr[] = {0,25,77,54,81,48};
        System.out.println(findMagicNumber(arr.length, arr));
    }
}
