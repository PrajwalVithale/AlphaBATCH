package LinkedList;
//import java.util.LinkedList;

public class mergeSortinLL {
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

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(rightHead);

        return merge(newleft,newright);
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        //LinkedList<Integer> ll=new LinkedList<>();
        mergeSortinLL ll=new mergeSortinLL();
        head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next=new Node(-1);

        ll.printLL();

        head=ll.mergeSort(head);
        ll.printLL();
    }
}
