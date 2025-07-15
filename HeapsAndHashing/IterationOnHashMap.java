package HeapsAndHashing;
import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India", 120); 
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Russia", 90);
        System.out.println(hm);
        Set<String> keys=hm.keySet();

        for (String s : keys) {
            System.out.println("Keys="+s+",values"+hm.get(s));
        }
    }
}
