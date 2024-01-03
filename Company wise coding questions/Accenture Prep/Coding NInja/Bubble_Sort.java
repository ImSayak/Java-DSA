import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort {
    public static void bubbleSort(int arr[], int n){
        int count = 0;
        for(int turn=0;turn<n-1;turn++){
            // boolean swap = false;
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                    // swap=true; 
                    count++; 
                }
            }
            // if(!swap) break;
        }
        System.out.println("Total swape need for bubble sort: "+count);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]) minPos=j;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println("Selection Sort:"+Arrays.toString(arr));
    }

    public static void insertionSort(int arr[], int n){
        for(int i=1;i<n;i++){
            int curr =arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Insertion sort: "+ Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
        selectionSort(arr, n);
        insertionSort(arr, n);
    }
}
