package HeapsAndHashing;
import java.util.*;

public class HashSetusingForEachLoop {
     public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Bangaluru");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Kolkata");

        for (String city : set) {
            System.out.print(city+" ");
        }
    }
}
