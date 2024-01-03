public class Q29 {
    public static boolean isPallindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
        // for(int i=0;i<str.length();i++){
        //     if(sb.charAt(i) != str.charAt(i)) return false;
        // }
        // return true;
    }
    public static void main(String[] args) {
        String str ="level";
        System.out.println(isPallindrome(str));
    }
}
