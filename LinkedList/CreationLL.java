package LinkedList;

public class CreationLL {
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
    public static int size=0;

    public void addFirst(int data){
         Node newnNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newnNode;
            return;
        }

        newnNode.next=head;
        head=newnNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void addMiddle(int data,int idx){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    
    public int removeMiddle(int idx){
        if(size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for(int i=0;i<idx-1;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return val;
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
        CreationLL ll=new CreationLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        ll.addMiddle(3, 2);
        ll.printLL();
        System.out.println("Removed Element: "+ll.removeFirst());
        ll.printLL();
        System.out.println("Removed Element: "+ll.removeLast());
        ll.printLL();

        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        System.out.println("Removed Element: "+ll.removeMiddle(3));
        ll.printLL();
        System.out.println(size);
    }
}
