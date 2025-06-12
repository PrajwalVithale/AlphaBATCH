package BackTracking;

import java.util.ArrayList;
import java.util.Collections;

public class sortInAL {
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(16);
        list.add(8);
        list.add(1);

        System.out.println(list);
        //inbuilt function
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
