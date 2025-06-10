package BackTracking;
import java.util.ArrayList;

public class OperationInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Add
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        list.add(2,5);
        list.add(3,8);
        System.out.println(list);

        //Get
        int element=list.get(2);
        System.out.println(element);

        //Remove
        list.remove(4);
        //System.out.println(list);

        //Set
        list.set(3, 7);
        //System.out.println(list);

        //contains
        System.out.println(list.contains(7));//true
        System.out.println(list.contains(5));//false
    }

}
