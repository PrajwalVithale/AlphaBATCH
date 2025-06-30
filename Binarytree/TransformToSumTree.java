package Binarytree;

public class TransformToSumTree {
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
        public static int TransformNode(Node root){
            if(root==null){
                return 0;
            }

            int leftC=TransformNode(root.left);
            int rightC=TransformNode(root.right);

            int data=root.data;
            int newL=root.left==null?0:root.left.data;
            int newR=root.right==null?0:root.right.data;
            root.data=newL+leftC+newR+rightC;

            return data;
        }

        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6) ;
        root.right.right=new Node(7);   
        //root.left.left.left=new Node(8);
        TransformToSumTree.BinaryTree.TransformNode(root);
        TransformToSumTree.BinaryTree.preOrder(root);
    }
}
