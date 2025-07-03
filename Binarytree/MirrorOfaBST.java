package Binarytree;

public class MirrorOfaBST {
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

    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }

        return root;
    }

    public static Node MirrorTree(Node root){
        if(root==null){
            return null;
        }

        Node leftS=MirrorTree(root.left);
        Node RightS=MirrorTree(root.right);

        root.left=RightS;
        root.right=leftS;

        return root;
    }

    public static void PreOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,10,3,6,11};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        PreOrder(root);
        System.out.println();
        
        Node newroot=MirrorTree(root);
        PreOrder(newroot);
    }
}
