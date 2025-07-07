package HeapsAndHashing;
import java.util.*;

//O(logn)
public class InsertInHeap {
    static ArrayList<Integer> al=new ArrayList<>();
    public static void add(int data){
        al.add(data);

        int x=al.size()-1;  //child index
        int par=(x-1)/2;  //parent index

        while(al.get(x)<al.get(par)){
            int temp=al.get(x);
            al.set(x,al.get(par));
            al.set(par, temp);
        }
    }

    public static int peek(){
        return al.get(0);
    }
    public static void main(String[] args) {
        add(1);
        add(3);
        add(4);
        add(5);
        add(8);
        add(9);
        add(12);
        add(15);

        System.out.println(" Root element "+peek());
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }
}
