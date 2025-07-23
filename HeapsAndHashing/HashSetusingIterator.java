package HeapsAndHashing;
import java.util.*;

public class HashSetusingIterator {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Bangaluru");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Kolkata");

        Iterator it=set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}
