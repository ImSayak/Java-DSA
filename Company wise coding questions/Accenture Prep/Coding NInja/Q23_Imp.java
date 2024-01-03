public class Q23_Imp {
    public static String reverseWord(String str){
        String ans = "";
        int i = str.length()-1;
        while(i>=0){
            while(i>=0 && str.charAt(i)==' ') i--;
            int j = i;
            while(i>=0 && str.charAt(i) != ' ') i--;
            if(ans.isEmpty()) ans = ans+str.substring(i+1, j+1);
            else ans = ans +" "+str.substring(i+1, j+1);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        String str = "    Sayak is a good    boy   ";
        System.out.println(reverseWord(str));
    }
}
