package HeapsAndHashing;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet();

        hs.add(5);
        hs.add(6);
        hs.add(3);
        hs.add(3);
        hs.add(8);
        hs.add(9);
        hs.add(5);
        System.out.println(hs);
        System.out.println(hs.contains(5));
        System.out.println(hs.size());
        hs.remove(5);
        System.out.println(hs);
    }
}
