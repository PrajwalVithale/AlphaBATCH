package Binarytree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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
        //both have TC O(n)
        //SC O(n)-arraylist
        public static boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root==null){
                return false;
            }
            
            path.add(root);
            if(root.data==n){
                return true;
            }
            boolean foundL=getPath(root.left, n,path);
            boolean foundR=getPath(root.right, n, path);

            if(foundL||foundR){
                return true;
            }

            path.remove(path.size()-1);

            return false;
        }

        public static Node LCA(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i=0;
            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lca=path1.get(i-1);
            return lca;
        }
        //reduced SC-O(1)
        public static Node LCA2(Node root,int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }

            Node leftLca=LCA2(root.left,n1,n2);
            Node rightLca=LCA2(root.right, n1, n2);

            if(rightLca==null){
                return leftLca;
            }
            if(leftLca==null){
                return rightLca;
            }

            return root;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);   
        root.left.left.left=new Node(8);
        int n1=5;
        int n2=4;
        System.out.println(LowestCommonAncestor.BinaryTree.LCA2(root,n1,n2).data);
    }
}
