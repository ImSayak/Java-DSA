public class ValidBST {
    static class Node {
        int data;
        Node left;
        Node right;
    
        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data <= min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);            root.right=new Node(10);  
        root.left.left=new Node(3);       
        root.left.left=new Node(3);       root.right.right=new Node(11);
        root.left.right=new Node(6);      
        root.left.left.left=new Node(1);    root.right.right.right=new Node(14);
        root.left.left.right=new Node(4);

        System.out.println(isValidBST(root, null,null ));
    }
}
