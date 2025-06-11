package BackTracking;

import java.util.ArrayList;

public class multiDimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); list.add(2); list.add(3);list.add(4);list.add(5);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2); list2.add(4); list2.add(6);list2.add(8);list2.add(10);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(3); list3.add(6); list3.add(9);list3.add(12);list3.add(15);

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //printing multiDimention AL
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currlist=mainList.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
