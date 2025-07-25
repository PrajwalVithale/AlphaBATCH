package Binarytree;

public class preOrderTraversal {
      static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                //System.out.print("-1 ");
                return;
            } 
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        //BinaryTree tree=new BinaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=preOrderTraversal.BinaryTree.buildTree(nodes);
        preOrderTraversal.BinaryTree.preOrder(root);
    }
}
