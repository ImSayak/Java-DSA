import java.util.Arrays;

public class Q30 {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        for(int i=0;i<str1.length();i++){
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str1 ="build", str2="dulbi";
        System.out.println(isAnagram(str1, str2));
    }
}
