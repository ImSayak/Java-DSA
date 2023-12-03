public class MirrorTheBST {
    static class Node {
        int data;
        Node left;
        Node right;
    
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node mirrorBST(Node root){//O(n)
        if(root==null){
            return null;
        }
        Node leftSubtree=mirrorBST(root.left);
        Node rightSubtree=mirrorBST(root.right);

        root.left=rightSubtree;
        root.right=leftSubtree;

        return root;
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
        Node root=new Node(8);
        root.left=new Node(5);            root.right=new Node(10);  
        root.left.left=new Node(3);       
        root.left.right=new Node(6);      root.right.right=new Node(11);
    
        preorder(root);
        System.out.println();

        mirrorBST(root);
        preorder(root);
    }
}
