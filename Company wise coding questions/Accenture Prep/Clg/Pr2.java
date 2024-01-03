public class Pr2{
    public static int MinSquare(int n){
        int count = 0;
        while(n != 0){
            int i=1;
            while(i*i <= n){
                i++;                
            }
            n = n-((i-1)*(i-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(MinSquare(n));
    }
}