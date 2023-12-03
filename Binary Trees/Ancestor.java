import java.sql.RowId;
import java.util.*;

public class Ancestor {
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

    public static boolean getPath(Node root,int n, ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true;
        }

        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        else{
          path.remove(path.size()-1);
          return false;  
        }     
    }

    public static Node lca(Node root,int n1, int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i=0;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        // last equal node -> (i-1)
        return path1.get(i-1);
    }

    // approach->2
    public static Node lca2(Node root,int n1, int n2){
        if(root==null || root.data ==n1 || root.data == n2){
            return root;
        }
        
        Node leftLca= lca2(root.left, n1, n2);
        Node rightLca= lca2(root.right, n1, n2);

        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }

        return root;
    }

    // Minumum Distance

    public static int dist(Node root, int n) {
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist= dist(root.left, n);
        int rightDist= dist(root.right, n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);

        int dist1= dist(lca, n1);
        int dist2= dist(lca, n2);

        return dist1+dist2;
    }

    //kth Ancestor of nodes:
    public static int kthAncestor(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftDis=kthAncestor(root.left, n,k);
        int rightDis=kthAncestor(root.right, n,k);
        if(leftDis==-1 && rightDis==-1){
            return -1;
        }
        int max = Math.max(leftDis, rightDis);
        if(max+1 == k){
            System.out.print("Your kth Ancestor= "+root.data);
        }
        return max+1;
    }

    //Transform to sum Tree
    public static int transform(Node root){
        if(root==null){
            return 0;
        }

        int leftChild=transform(root.left);
        int rightChild=transform(root.right);

        int newLeft= root.left==null ? 0:root.left.data;
        int newRight= root.right==null ? 0:root.right.data;

        int data=root.data;
        root.data= newLeft+ leftChild + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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
        // System.out.println(lca(root, 4, 6).data);
        // System.out.println(lca2(root, 4, 5).data);
        // System.out.println(minDist(root, 4, 6));
        // kthAncestor(root, 4, 2);
        transform(root);
        preorder(root);
    }
}
