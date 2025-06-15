package LinkedList;

public class RemovingCycleinLL {
      public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;

    public static boolean isCyclic(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void RemoveCyclic(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        Node prev=null;
        slow=head;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;
    
    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        System.out.println(isCyclic(head));
        RemoveCyclic();
        System.out.println(isCyclic(head));
    }
}