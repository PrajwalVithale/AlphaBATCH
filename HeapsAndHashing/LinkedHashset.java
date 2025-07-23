package HeapsAndHashing;
import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Bangaluru");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Kolkata");
        System.out.println(set);

        //ordered based on Insertion
        
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Bangaluru");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Kolkata");
        System.out.println(lhs);
    }
}
