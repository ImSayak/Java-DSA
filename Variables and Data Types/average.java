//Inaprogram,input 3 numbers:A,B and C.You have to output the average of these 3 numbers
import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println(avg);
    }
}