package Binarytree;

public class DeleteNodeinBST {
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

    public static Node delNode(Node root,int val){
        if(root.data<val){
            root.right=delNode(root.right, val);
        }
        else if(root.data>val){
            root.left=delNode(root.left, val);
        }else{
            //case 1: No child
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2:single child
            if(root.right==null){
                return root.left;
            }else if(root.left==null){
                return root.right;
            }

            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delNode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
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
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root); 

        root=delNode(root, 5);
        System.out.println();
        inorder(root);
    }
} 
