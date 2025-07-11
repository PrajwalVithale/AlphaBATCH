package Binarytree;

import java.util.ArrayList;

public class ConvertBSTtoBalanceBST {
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
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

     public static Node createBST(ArrayList<Integer> inorder,int st,int ed){
        if(st>ed){
            return null;
        }
        int mid=(st+ed)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder, st, mid-1);
        root.right=createBST(inorder, mid+1, ed);
        return root;
    }

    public static Node balenceBST(Node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root, inorder);

        root=createBST(inorder,0,inorder.size()-1);
        return root;
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

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);  
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        preOrder(root);
        System.out.println();
        root=balenceBST(root);
        preOrder(root);
    }
}
