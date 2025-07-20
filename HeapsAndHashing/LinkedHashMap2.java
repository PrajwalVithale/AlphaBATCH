package HeapsAndHashing;
import java.util.*;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        //key are in insorted order
        
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("China",100);
        lhm.put("India", 50);
        lhm.put("USA", 25);
        lhm.put("Nagaland", 50);

     HashMap<String,Integer> hm=new HashMap<>();
        hm.put("China",100);
        hm.put("India", 50);
        hm.put("USA", 25);
        hm.put("Nagaland", 50);        

        System.out.println(lhm);
        System.out.println(hm);
    }
}
