public class Find_First_Occurence {

    public static int firstOccurence(int arr[], int i, int key) {
        if(i ==  arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }else{
            return firstOccurence(arr, i+1, key);
        }
    }
        public static int lastOccurence(int arr[], int i, int key) {
            if(i ==  -1){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }else{
                return lastOccurence(arr, i-1, key);
            }
    }
    public static void main(String[] args) {
        int arr[]={6,8,2,1,4,2,3,1};
        int key= 2;
        System.out.println(firstOccurence(arr, 0, key));
        System.out.println(lastOccurence(arr, arr.length-1, key));
    }
 }