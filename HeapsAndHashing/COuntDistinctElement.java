package HeapsAndHashing;
import java.util.*;

public class COuntDistinctElement {
    public static void main(String[] args) {
        int arr[]={2200,5220,250,222,2220,2200,650,650,755,250};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println("ans="+hs.size());

        for (Integer i : hs) {
            System.out.print(i+" ");
        }
    }
}
