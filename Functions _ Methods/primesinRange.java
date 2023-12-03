public class primesinRange {
    public static boolean isPrime(int n) 
    {
        if(n == 2)
        {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
           {
                return false;
            }
        }
        return true;
    }
    public static void printprime(int n1, int n2) {
        for(int i=n1; i<n2; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]) 
    {
        printprime(5000,5100);
        
    }
}
