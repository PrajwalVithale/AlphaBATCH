package BackTracking;

import java.util.ArrayList;

public class MaximuminAL {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(16);
        list.add(8);
        list.add(1);

        Integer max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }
            //OR
            max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum number is "+max);
    }
}
