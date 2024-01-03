public class P6 {
    public static int LetteredNumberedSum(char str[], int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            if(str[i] == 'A') sum += 1;
            if(str[i] == 'B') sum += 10;
            if(str[i] == 'C') sum += 100;
            if(str[i] == 'D') sum += 1000;
            if(str[i] == 'E') sum += 10000;
            if(str[i] == 'F') sum += 100000;
            if(str[i] == 'G') sum += 1000000;
        }
        return sum;
    }
    public static void main(String[] args) {
        char str[] = {'D', 'C', 'C', 'B', 'A', 'A'};
        int n = str.length;
        System.out.println(LetteredNumberedSum(str, n));
    }
}
