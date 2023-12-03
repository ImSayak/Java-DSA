import java.util.*;
public class incomeTax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int income = sc.nextInt();
        float tax;

        if(income<500000){
            tax=0;  
        }
        else if(income>=500000 && income<1000000){
            tax= income* 0.2f; 
        }
        else{
            tax= income* 0.03f;
        }
        System.out.println("Your tax is: "+tax);
    }

}