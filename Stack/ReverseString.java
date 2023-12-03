import java.util.*;

public class ReverseString {
    public static String reverseStrings(String str){
        Stack<Character> s = new Stack<>();

        for(int idx = 0; idx <str.length(); idx++){
            s.push(str.charAt(idx));
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseStrings(str);
        System.out.println(result);
    }
}
