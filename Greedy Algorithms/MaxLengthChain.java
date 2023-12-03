import java.util.Comparator;
import java.util.*;

public class MaxLengthChain { //n(log n)
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int maxChain=1;
        int endChain=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>endChain){
                maxChain++;
                endChain=pairs[i][1];
            }
        }
        System.out.println("Maximum Length is "+ maxChain);
    }
}
