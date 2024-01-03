import java.util.Scanner;
public class Valid_Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        int index = mail.indexOf("@");
        int subStrLen=mail.substring(0, index).length();
        if(index==0) System.out.println("Invalid");
        else{
            String replace="";
            if(index<=5){
                for(int i=0;i<subStrLen;i++){
                    replace += "*";
                }
                System.out.println(mail.replace(mail.substring(0, index), replace));
            }else{
                for(int i=0;i<subStrLen-3;i++){
                    replace += "*";
                }
                System.out.println(mail.replace(mail.substring(2, index), replace));
            }
        }
    }
}
