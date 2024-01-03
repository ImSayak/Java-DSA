import java.util.Scanner;
public class Print_All_Substring {
    public static void printSubsting(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            s="";
            for(int j=i;j<str.length();j++){
                // s += str.charAt(j);
                System.out.println(str.substring(i, j+1));
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubsting(str);
    }
}
