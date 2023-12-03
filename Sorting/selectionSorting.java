public class selectionSorting {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]={6,4,3,2,5};
        selectionSort(arr);
        printArray(arr, arr.length);
    }
}
