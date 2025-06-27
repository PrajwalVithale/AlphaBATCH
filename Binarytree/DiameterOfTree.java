package Binarytree;

public class DiameterOfTree {
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

        public static int heightOftree(Node root){
            if(root==null){
                return 0;
            }
            
            int lh=heightOftree(root.left);
            int rh=heightOftree(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameterOftree(Node root){
            if(root==null){
                return 0;
            }

            int LD=diameterOftree(root.left);//LEFT DIAMETER
            int LH=heightOftree(root.left);//LEFT HEIGHT
            int RD=diameterOftree(root.right);//RIGHT DIAMETR
            int RH=heightOftree(root.right);//RIGHT HEIGHT
            int selfDiameter=LH+RH+1;
            return Math.max(selfDiameter,Math.max(LD, RD)); 
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
        System.out.println(DiameterOfTree.BinaryTree.diameterOftree(root));
    }
}
