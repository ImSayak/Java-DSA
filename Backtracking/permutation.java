public class permutation {
    public static void permtation(String str, String ans) {
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length(); i++){
            char curr=str.charAt(i);
            String NewString= str.substring(0, i)+str.substring(i+1);
            permtation(NewString, ans+curr);
        }        
    }
    public static void main(String[] args) {

        permtation("abc", "");
    }
}
