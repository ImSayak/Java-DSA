import java.util.*;
import java.math.*;
public class shortestPath {
    public static float getShortestPath(String str) {
        int x=0,y=0;
        for(int i=0; i<str.length();i++){
            //North
            if(str.charAt(i)=='N'){
                y++;
            }
            //South
            else if(str.charAt(i)=='S'){
                y--;
            }
            //West
            else if(str.charAt(i)=='W'){
                x--;
            }
            //East
            else if(str.charAt(i)=='E'){
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
