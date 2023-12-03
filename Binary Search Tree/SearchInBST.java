public class SearchInBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    public static boolean search(Node root, int key){ //O(H)
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        //for left
        if(root.data>key){
            return search(root.left, key);
        }
        //for right
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);            root.right=new Node(10);  
        root.left.left=new Node(3);       
        root.left.left=new Node(3);       root.right.right=new Node(11);
        root.left.right=new Node(6);      
        root.left.left.left=new Node(1);    root.right.right.right=new Node(14);
        root.left.left.right=new Node(4);

        System.out.println(search(root,14));
    }
}
