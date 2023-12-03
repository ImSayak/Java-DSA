import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int n=3;
        int capacity=50;
        int values[] = {60,100,120};
        int weight[] = {10,20,30};

        double arr[][]=new double[n][4];
        for(int i=0;i<n;i++){
            arr[i][0]=i;//for index
            arr[i][1]=values[i];
            arr[i][2]=weight[i];
            arr[i][3]= (values[i]/(double)weight[i]);//ratio = value/weight
        }

        Arrays.sort(arr,Comparator.comparingDouble(o->o[3]));//sort in assending 
        double val=0;
        for(int i=n-1;i>=0;i--){
            if(capacity>=arr[i][2]){
                capacity-=arr[i][2]; //capacity-weight
                val= val+arr[i][1]; //val+value
            }
            else{
                val=val+(arr[i][3]*capacity);//ratio*capacity
                break;
            }
        }
        System.out.println("Max Value "+val);
    }
}
