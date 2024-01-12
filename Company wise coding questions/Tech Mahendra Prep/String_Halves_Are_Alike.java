public class String_Halves_Are_Alike {
    public static boolean halvesAreAlike(String s) {
        int count=0;
        s = s.toLowerCase();
        System.out.println(s.toLowerCase());
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||
            s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            count++;
        }
        for(int i=s.length()/2;i<=s.length()-1;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||
            s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            count--;
        }
        if(count != 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Uo"));
    }
}
