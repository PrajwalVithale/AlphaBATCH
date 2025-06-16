package LinkedList;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Empty DLL");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    public void removeLast(){
         if(head==null){
            System.out.println("Empty DLL");
            return;
        }
         if(size==1){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(2);
        //dll.addFirst(1);
        //dll.print();
        //dll.removeFirst();
        //dll.addLast(3);
        //dll.addLast(4);
        dll.removeLast();
        dll.print();
        System.out.println(size);
    }
}
