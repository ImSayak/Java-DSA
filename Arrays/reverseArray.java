public class reverseArray {

    public static void reverse(int array[]){
        int start=0; int end = array.length -1;
        while(start<end){
            
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        start++;
        end--;
    }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,7,8,9};
        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}