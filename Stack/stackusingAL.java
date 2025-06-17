package Stack;
import java.util.ArrayList;

public class stackusingAL {
        static ArrayList<Integer> l=new ArrayList<>();

        public static boolean isEmpty(){
            return l.size()==0;
        }

        public void push(int data){
            l.add(data);
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=l.get(l.size()-1);
            l.remove(l.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return l.get(l.size()-1);
        }
    public static void main(String[] args) {
        stackusingAL s=new stackusingAL();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
