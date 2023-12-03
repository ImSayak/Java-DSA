import java.util.*;
public class Chocola_problem {
    public static void main(String[] args) {
        int n=4, m=6;
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,2,1};//n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost=0;

        while(v<costVer.length && h<costHor.length){
            if(costVer[v] >= costHor[h]){//vertical cuts
                cost+= (hp*costVer[v]);
                v++;
                vp++;
            }else{//horizontal cuts
                cost+=(vp*costHor[h]);
                h++;
                hp++;
            }
        }
        while(h<costHor.length){
            cost+=(vp*costHor[h]);
            h++;
            hp++;
        }
        while(v<costVer.length){
            cost+= (hp*costVer[v]);
            v++;
            vp++;
        }

        System.out.println("Total cost = "+cost);
    }
}
