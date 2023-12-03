import java.util.*;
public class practice{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Scanner sc= new Scanner(System.in);
        int arr[]= new int [5];
        try{
            for(int i=0;i<6;i++){
                arr[i]= sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}