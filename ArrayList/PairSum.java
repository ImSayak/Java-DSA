import java.util.ArrayList;

public class PairSum {
    public static boolean pairSm(ArrayList<Integer> al,int target){
        int i=0;
        int j= al.size()-1;
        while(i!=j){
            int currTarget= al.get(i)+al.get(j);
            //case 1
            if(currTarget == target){
                return true;
            }
            // case 2
            if(currTarget<target){
                i++;
            }
            //case 3
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSm(list, 5));
    }
}
