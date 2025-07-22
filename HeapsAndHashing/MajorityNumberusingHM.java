package HeapsAndHashing;
import java.util.*;

public class MajorityNumberusingHM {
public static void main(String[] args) {
    int arr[]={1,2};
    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int i=0;i<arr.length;i++){
        // if(hm.containsKey(arr[i])){
        //     hm.put(arr[i],hm.get(arr[i])+1);
        // }else{
        //     hm.put(arr[i],1);
        // }

        hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
    }

    

    for(Integer key:hm.keySet()){
        if(hm.get(key)>arr.length/3){
            System.out.println(key);
        }
    }
}    
}
