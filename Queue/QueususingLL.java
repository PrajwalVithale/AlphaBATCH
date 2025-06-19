package Queue;

public class QueususingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head=null;
        public static Node tail=null;

        public static boolean isEmpty(){
            return head==null&& tail==null;
        }

        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result=head.data;
            if(tail==head){
                head=tail=null;
            }else{
                head=head.next;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(04);
        remove();
        while (!isEmpty()){
            System.out.println(remove());
            //remove();
        }
    }
}
