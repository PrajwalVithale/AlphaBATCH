package HeapsAndHashing;

import java.util.HashMap;

public class HashMapOpearations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Russia", 90);

        System.out.println(hm);
        System.out.println(hm.get("USA"));
        System.out.println(hm.isEmpty());

        System.out.println(hm.containsKey("Russia"));
         System.out.println(hm.size());
        //System.out.println(hm.remove("China"));

         System.out.println(hm);

        //hm.clear();
         
    }
}
