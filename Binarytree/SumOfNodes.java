package Binarytree;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        public static int SumofNodes(Node root){
            if(root==null){
                return 0;
            }

            int lc=SumofNodes(root.left);
            int rc=SumofNodes(root.right);
            return lc+rc+root.data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Node root=heightOfTree.BinaryTree.buildTree(nodes);
        System.out.println(SumOfNodes.BinaryTree.SumofNodes(root));
    }
}
