public class MergeSort {

    public static void PrintArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Mergesort(int arr[], int si, int ei) {
        //base
        if(si>=ei){
            return;
        }
        //kaam
        int mid= si+(ei-si)/2; //(si+ei)/2
        Mergesort(arr, si, mid); // left part
        Mergesort(arr, mid+1, ei); // Right part

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        //left(0,3)=4 right(4,6)=3--> 6-0+1=7
        int temp[]= new int[ei-si+1];
        int i= si; //iteretor for left part
        int j= mid+1; // iteretor for right part
        int k= 0; //iteretor for temp arr
        
        while(i<=mid && j<= ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left
        while(i <= mid){
            temp[k++]= arr[i++];
        }

        //right
        while(j <= ei){
            temp[k++]= arr[j++];
    }

    //copy temp to original
    for(k=0, i=si ; k<temp.length ; k++ , i++){
        arr[i]=temp[k];
    }
    
}
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        Mergesort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}