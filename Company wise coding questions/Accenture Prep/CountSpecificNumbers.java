import java.util.*;
public class CountSpecificNumbers {
    public static int countSpecificNumbers(int m, int n){
    String s="";
    int count=0;
    for(int i=m;i<=n;i++){
        s = ""+i;
        int j=0;
        while(j<s.length()){
            if(s.charAt(j) != '1' && s.charAt(j) != '4' && s.charAt(j) !='9') break;
            j++;
        }
        if(j==s.length()) count++;
    }
    return count;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(countSpecificNumbers(m, n));
    }
}
