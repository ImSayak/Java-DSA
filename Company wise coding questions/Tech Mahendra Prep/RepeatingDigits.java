import java.util.*;

public class RepeatingDigits {
    
    public static int repeatingDigit(int n){
        int count=0;
        String number= n+"";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<number.length();i++){
            map.put(number.charAt(i), map.getOrDefault(number.charAt(i),0)+1);
        }
        for(char key: map.keySet()){
            if(map.get(key)>1) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 34544;
        System.out.println(repeatingDigit(num));
    }
}
