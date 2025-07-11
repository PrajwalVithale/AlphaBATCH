package HeapsAndHashing;
import java.util.*;

public class DeleteInHeap {
   
    static ArrayList<Integer> al=new ArrayList<>();
    public static void add(int data){
        al.add(data);

        int x=al.size()-1;  //child index
        int par=(x-1)/2;  //parent index

        while(al.get(x)<al.get(par)){
            int temp=al.get(x);
            al.set(x,al.get(par));
            al.set(par, temp);

            x=par;
            par=(x-1)/2;
        }
    }
    //root element
    public static int peek(){
        return al.get(0);
    }

    private static void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minidx=i;

        if(left<al.size() && al.get(minidx) > al.get(left)){
            minidx=left;
        }
        if(right<al.size() && al.get(minidx) > al.get(right)){
            minidx=right;
        }

        if(minidx!=i){
            int temp=al.get(i);
            al.set(i, al.get(minidx));
            al.set(minidx, temp);

            heapify(i);
        }
    }

    public static int remove(){
            int data=al.get(0);
        //Swap
            int temp=al.get(0);
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1,temp);
        //Delete Last
            al.remove(al.size()-1);
        //fix-heap
            heapify(0);
            return data;
    }

    public static boolean isEmpty(){
        return al.size()==0;
    }
    public static void main(String[] args) {
        add(1);
        add(3);
        add(4);
        add(5);
        add(8);
        add(7);
        add(12);
        add(15);
        //al.remove(2);
        System.out.println(" Root element "+peek());
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

         while (!isEmpty()) {
            System.out.print(peek()+" ");
            remove();
        }
    }
}