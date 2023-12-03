import java.util.*;
public class TopView {
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
        //TopView
        static class infoo{
            Node node;
            int hd;
            public infoo(Node node, int hd){
                this.node=node;
                this.hd=hd; 
            }
        }

        public static void topView(Node root){
            //Level Order 
            Queue<infoo>q=new LinkedList<>();
            HashMap<Integer,Node>map=new HashMap<>();

            int min=0,max=0;

            q.add(new infoo(root, 0));
            q.add(null);
            while(!q.isEmpty()){
                infoo curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){//first time occurd
                        map.put(curr.hd,curr.node);
                    }

                    if(curr.node.left!=null){
                        q.add(new infoo(curr.node.left, curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new infoo(curr.node.right, curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    }   
                }
                
            }

            for(int i=min; i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(5);
                    //     1
                    //    / \
                    //   2   3
                    //  / \   \
                    // 4   5   6

        topView(root);
    }
}
