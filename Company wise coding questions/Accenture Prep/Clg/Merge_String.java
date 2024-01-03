import java.util.*;
public class Merge_String {
    public static char[] MergeString(char[] s1, char[] s2) {
        char[] strArr = new char[s1.length + s2.length];

        int n = s1.length + s2.length - 2;
        int i = 0;
        while (i < s1.length && i < s2.length) {
            if (s1[i] < s2[i]) {
                strArr[i] = s1[i];
                strArr[n - i + 1] = s2[i];
            } else {
                strArr[i] = s2[i];
                strArr[n - i + 1] = s1[i];
            }
            i++;
        }
        while (i < s1.length) {
            strArr[i] = s1[i];
            i++;
        }
        while (i < s2.length) {
            strArr[i] = s2[i];
            i++;
        }

        return strArr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter s1: ");
        char[] s1 = sc.next().toCharArray();
        System.out.println("Enter s2: ");
        char[] s2 = sc.next().toCharArray();
        
        System.out.println("Result: ");
        char arr[] = MergeString(s1, s2);
        System.out.println(new String(arr));
    }
}
