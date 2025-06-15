package LinkedList;

import java.util.LinkedList;;

public class CreationUsingJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        ll.add(2, 5);
        System.out.println(ll);
    }
}
