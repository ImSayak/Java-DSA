import java.util.*;

public class BuildTreePreorder{//   O(n)
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTrees(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTrees(nodes);
            newNode.right=buildTrees(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null ){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //Lavel Order Traversal
        public static void lavelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        //height of tree
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }

        //Count of Nodes
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int leftCount=count(root.left);
            int rightCount=count(root.right);
            return leftCount+rightCount+1;
        }
        //sum of Nodes
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sum(root.left);
            int rightSum=sum(root.right);

            return leftSum+rightSum+root.data;
        }
        //find diameter approach-1
        public static int diameter2(Node root){// O(n^2)
            if(root==null){
                return 0;
            }
            int leftDiam=diameter2(root.left);
            int leftHeight=height(root.left);
            int rightDiam=diameter2(root.right);
            int rightHeight=height(root.right);

            int selfdiam=leftHeight+rightHeight+1;
            return Math.max(selfdiam, Math.max(leftDiam, rightDiam));
        }
        //find diameter approach-2
        static class info{
            int diam;
            int ht;

            public info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static info diameter(Node root){ //O(n)
            if(root==null){
                return new info(0,0);
            }
            info leftInfo=diameter(root.left);
            info rightInfo=diameter(root.right);

            int diam=Math.max(leftInfo.ht+rightInfo.ht+1, Math.max(leftInfo.diam,rightInfo.diam));
            int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new info(diam, ht);
        }

        //find Sub tree
        public static boolean isIdentical(Node node, Node subroot){
            if(node==null && subroot==null){
                return true;
            }
            else if(node==null || subroot==null || node.data != subroot.data){
                return false;
            }
            if(!isIdentical(node.left, subroot.left)){
                return false;
            }
            if(!isIdentical(node.right, subroot.right)){
                return false;
            }
            return true;
        }

        public static boolean isSubtree(Node root, Node subroot){
            if(root == null){
                return false;
            }
            if(root.data==subroot.data){
                isIdentical(root,subroot);
                return true;
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                    //     1
                    //    / \
                    //   2   3
                    //  / \   \
                    // 4   5   6
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTrees(nodes);

        Node subroot = new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
                    //   2 
                    //  / \  
                    // 4   5

        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.lavelOrder(root);
        // System.out.println("Height of the tree= "+tree.height(root)); 
        // System.out.println("Nodes of the tree= "+tree.count(root));
        // System.out.println("Sum of the all Nodes= "+tree.sum(root));
        // System.out.println("Diameter of the tree= "+tree.diameter(root).diam);
        // System.out.println("This is Subtree= "+tree.isSubtree(root, subroot));
    }
}