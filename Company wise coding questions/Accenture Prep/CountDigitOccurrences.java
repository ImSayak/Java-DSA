import java.util.Scanner;

public class CountDigitOccurrences {
    public static int digitOccurrences(int l, int u, int x){
        String s="";
        int count =0;
        for(int i=l;i<=u;i++){
            s = ""+i;
            int j=0;
            while(j<s.length()){
                if(s.charAt(j)=='2') count++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(),u=sc.nextInt(),x=sc.nextInt();
        System.out.println(digitOccurrences(l, u, x));
    }
}
