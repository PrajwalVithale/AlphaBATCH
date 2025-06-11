package BackTracking;
import java.util.ArrayList;

public class reverseinAL {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        //Reverse loop
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
