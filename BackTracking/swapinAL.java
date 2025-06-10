package BackTracking;

import java.util.ArrayList;

public class swapinAL {
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(16);
        list.add(8);
        list.add(1);

        int idx1=2,idx2=4;
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
}
