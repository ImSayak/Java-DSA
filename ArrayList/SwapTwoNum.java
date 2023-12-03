import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthStyleFactory;

public class SwapTwoNum {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp= list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        int indx1=1,indx2=3;

        System.out.println(list);
        swap(list, indx1, indx2);
        //               Sort in ArrayList               //
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
