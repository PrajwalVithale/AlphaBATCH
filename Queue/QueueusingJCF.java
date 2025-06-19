package Queue;
import java.util.*;

public class QueueusingJCF {

    public static void printQ(){}
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //because Queue is a interface so we cannot able to make obj of it
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();

          while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
