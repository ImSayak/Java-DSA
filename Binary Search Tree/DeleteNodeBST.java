public class DeleteNodeBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {// voila
                // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case -2 - single child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case-3 - both child
            TreeNode IS = findInorderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }
        return root;
    }

    public static TreeNode findInorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(5);            root.right=new TreeNode(10);  
        root.left.left=new TreeNode(3);       
        root.left.left=new TreeNode(3);       root.right.right=new TreeNode(11);
        root.left.right=new TreeNode(6);      
        root.left.left.left=new TreeNode(1);    root.right.right.right=new TreeNode(14);
        root.left.left.right=new TreeNode(4);
        inorder(root);
        System.out.println();
        root =deleteNode(root, 5);
        inorder(root);
    }
}
