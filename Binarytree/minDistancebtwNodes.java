package Binarytree;

public class minDistancebtwNodes {
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

        public static int lcalDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftD=lcalDist(root.left, n);
            int rightD=lcalDist(root.right, n);

            if(leftD==-1 && rightD==-1){
                return -1;
            }
            else if(leftD==-1){
                return rightD+1;
            }else{
                return leftD+1;
            }
        }
        public static int minDist(Node root,int n1,int n2){
            Node lca=LCA2(root,n1,n2);
            int dist1=lcalDist(lca,n1);
            int dist2=lcalDist(lca,n2);
            return dist1+dist2;
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
        int n1=4;
        int n2=7;
        System.out.println(minDistancebtwNodes.BinaryTree.minDist(root, n1, n2));
    }
}
