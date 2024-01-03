import java.util.Scanner;

public class Trim_Space {
    // public static String trimSpace(String str){
    //     String s = "";
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)== ' ') continue;
    //         s += str.charAt(i);
    //     }
    //     return s;
    // }
    // public static void trimSpace(String str){
    //     str = str.replaceAll("\\s+", "");
    // }
    public static void main(String[] args) {
        String str = "   I     am a Good Boy   ";
        System.out.println(str.replaceAll(" ", ""));
    }
}
