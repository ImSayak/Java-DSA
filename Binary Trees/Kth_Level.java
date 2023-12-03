import java.util.*;

public class Kth_Level {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            left=null;
            right=null;
        }
    }
        //print Kth Level
        //approach -1 using level Order
        static int count=1;
        public static void KLevel(Node root,int level, int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }else{
                KLevel(root.left, level+1, k);
                KLevel(root.right, level+1, k); 
            }
            
        }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(6);
                    //     1
                    //    / \
                    //   2   3
                    //  / \   \
                    // 4   5   6
        int k=3;
        KLevel(root,1,k);
    }
}
