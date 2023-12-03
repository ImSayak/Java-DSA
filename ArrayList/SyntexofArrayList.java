import java.util.ArrayList;

public class SyntexofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //get element
        System.out.println(list.get(3));
        //delete element    
        System.out.println(list.remove(2));
        System.out.println(list);
        //set element at a index    
        System.out.println(list.set(3,10));
        //check element is exist or nots
        System.out.println(list.contains(2));    
    }
}