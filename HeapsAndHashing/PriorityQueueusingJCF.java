package HeapsAndHashing;
import java.util.Comparator;
import java.util.PriorityQueue;;

public class PriorityQueueusingJCF {
    public static void main(String[] args) {
        //reverse Order
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(2);
        pq.add(10);
        pq.add(1);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
