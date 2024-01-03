import java.text.StringCharacterIterator;
import java.util.Arrays;

public class Q14 {
    public static String Frequentcharacter(String str, char x){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        int maxCount=0;
        char highestFreqChar =' ';
        int i=0;
        while(i<arr.length-1){
            int count=0;
            while(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(maxCount<count){
                maxCount=count;
                highestFreqChar=arr[i];
            }else if(maxCount==count){
                if(highestFreqChar>arr[i]) highestFreqChar=arr[i];
            }
            i++;
        }

        StringBuilder sb = new StringBuilder(str);
        for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)==highestFreqChar) sb.replace(j, j+1, ""+x);
        }
        return sb.toString();

    }
    public static void main(String args[]){
        String str ="bbadbbababb";
        System.out.println(Frequentcharacter(str,'t'));
    }
}
