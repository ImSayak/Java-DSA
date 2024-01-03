public class Minimum_Length_Word {
    public static String minLenWord(String str){
        String s[] = str.trim().split("\\s+");
        int min = Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()<min){
                min = s[i].length();
                res = s[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "sayak is a Good Boy";
        System.out.println(minLenWord(str));
    }
}
