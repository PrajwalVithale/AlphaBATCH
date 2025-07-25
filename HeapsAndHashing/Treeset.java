package HeapsAndHashing;
import java.util.*;

public class Treeset {
    public static void main(String[] args) {
         HashSet<String> set=new HashSet<>();
        set.add("Bangaluru");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Kolkata");
        System.out.println(set);


        TreeSet<String> ts=new TreeSet<>();
        ts.add("Bangaluru");
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Chennai");
        ts.add("Kolkata");
        System.out.println(ts);
    }
}
