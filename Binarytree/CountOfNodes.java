package Binarytree;

public class CountOfNodes {
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
        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }

            int lc=countNodes(root.left);
            int rc=countNodes(root.right);
            return lc+rc+1;
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
        System.out.println(CountOfNodes.BinaryTree.countNodes(root));
    }
}
