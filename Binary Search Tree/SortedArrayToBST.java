import java.util.ArrayList;

public class SortedArrayToBST {

    static class Node {
        int data;
        Node left;
        Node right;
    
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node createBST(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(nums[mid]);

        root.left = createBST(nums,start,mid-1);
        root.right = createBST(nums,mid+1,end);

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


    // Convert BST to valid BST

    public static void getInorder(Node root,ArrayList<Integer> inorder){ //O(n)
        if(root==null) return;

        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }

    public static Node createValidBST(ArrayList<Integer>inorder,int st, int end){ //O(n)
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left = createValidBST(inorder,st,mid-1);
        root.right = createValidBST(inorder,mid+1,end);

        return root;
    }

    public static Node convertBST(Node root){ // O(n)
        //get inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root, inorder);

        //create bst from sorted list
        return createValidBST(inorder, 0, inorder.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root = createBST(arr,0,arr.length-1);
        preorder(root);
        System.out.println();

        Node node = new Node(8);
        node.left = new Node(6);
        node.left.left = new Node(5);
        node.left.left.left = new Node(3);

        node.right=new Node(10);
        node.right.right=new Node(11);
        node.right.right.right=new Node(12);

        node=convertBST(node);
        preorder(node);
    }
}
