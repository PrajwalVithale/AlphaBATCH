package HeapsAndHashing;
import java.util.*;

public class ItineraryFromTicket {

    public static String getStarted(HashMap<String,String> tickets){
        HashMap<String,String> rev=new HashMap<>();

        for (String s : tickets.keySet()) {
            rev.put(tickets.get(s), s);
        }

        for (String key : tickets.keySet()) {
            if(!rev.containsKey(key)){
                return  key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> hs=new HashMap<>();
        hs.put("chennai", "bengaluru");
        hs.put("mumbai", "Delhi");
        hs.put("goa", "chennai");
        hs.put("delhi", "goa");
        String start=getStarted(hs);
        System.out.print(start);

        for (String k : hs.keySet()) {
            System.out.print("->"+hs.get(k));
            start=hs.get(start);
        }
    }
}
