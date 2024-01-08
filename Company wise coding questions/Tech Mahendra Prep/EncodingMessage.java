import java.util.*;

public class EncodingMessage {
	public static String encode(String message) {
		StringBuffer sb = new StringBuffer();
        for(int i=0;i<message.length();i++){
            int count = 1;
            while(i<message.length()-1 && message.charAt(i)== message.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(message.charAt(i));
            sb.append(count);
        }
        return sb.toString();
	}

    public static void main(String[] args) {
        System.out.println(encode("aabbccd"));
    }
}