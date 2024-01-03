public class Q26 {
    public static int findMod(String str){
        int num = Integer.parseInt(str);
        //int num = Integer.valueOf(str);
        return num%11;
    }
    
    public static void main(String[] args) {
        System.out.println(findMod("121"));
    }
}
