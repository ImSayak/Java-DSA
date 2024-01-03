import java.util.Scanner;

public class Q27 {
    public static void ifStraight(int points[]){
        boolean isStraight=true;
        for(int i=0;i<points.length-1;i=i+2){
            if(points[i]-points[i+1] != 0) isStraight=false;
        }
        if(isStraight) System.out.println(points[0]+"x-"+points[1]+"y=0");
        else System.out.println("0");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to put: ");
        int n = sc.nextInt();
        int points[] = new int[n*2];
        int k=1;
        for(int i=0;i<n*2;i=i+2){
            System.out.println("Enter point "+k+": ");
            points[i] = sc.nextInt();
            points[i+1] = sc.nextInt();
            k++;
        }
        ifStraight(points);
    }
}
