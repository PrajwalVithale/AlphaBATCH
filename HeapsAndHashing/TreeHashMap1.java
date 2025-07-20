package HeapsAndHashing;
import java.util.*;

public class TreeHashMap1 {
    public static void main(String[] args) {
        //keys are in sorted form
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("China",100);
        tm.put("India", 50);
        tm.put("USA", 25);
        tm.put("Nagaland", 50);

     HashMap<String,Integer> hm=new HashMap<>();
        hm.put("China",100);
        hm.put("India", 50);
        hm.put("USA", 25);
        hm.put("Nagaland", 50); 

         System.out.println(tm);
        System.out.println(hm);
    }
}
