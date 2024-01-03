// Question: A company called Digicomparts manufactures 52 types of unique products for laptop and desktop
// computers. They produce 10 types of laptop products and 42 types of desktop products.
// Each product manufactured by the company has a unique productID from a-z and A-Z. 
// The laptop products have productIDs (a, i, e, o, u, A, I, E, O, U) while the rest of the productIDs are assigned
// to the desktop products. The company manager wishes to find the sales data for the desktop products.
// Task: Given a list of productIDs of the sales of the last N products, write an algorithm to help the manager 
// find the productIDs of the desktop products.

import java.util.Scanner;

public class Helping_Manager {
    public static int findDesktopNumber(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'
            || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                
            }else{
                res += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter serial Id: ");
        String serial = sc.nextLine();
        System.out.println("Number of desktop Items= "+ findDesktopNumber(serial));
    }
}
