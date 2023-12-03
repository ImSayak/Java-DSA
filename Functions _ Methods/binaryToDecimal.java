import java.util.Scanner;

public class binaryToDecimal 
{
    public static void binToDec(int binNum)
    {
        int myNum=binNum;
        int dec=0;
        int pow=0;
        while(binNum>0)
        {
            int lastDig = binNum%10;
            dec= dec+ (lastDig*(int)Math.pow(2, pow));
            pow++;
            binNum= binNum/10;
            
        }   
        System.out.println("Decimal of "+myNum+" ="+dec);             
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        binToDec(n);
        
    }
}
    

