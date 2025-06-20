package Queue;
import java.util.*;

public class Queueusing2Stacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        public static int peek(){
             if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        //Queueusing2Stacks q=new Queueusing2Stacks();
        Queueusing2Stacks.Queue.add(1);
        Queueusing2Stacks.Queue.add(2);
        Queueusing2Stacks.Queue.add(3);
        Queueusing2Stacks.Queue.add(4);

        while(!Queueusing2Stacks.Queue.isEmpty()){
            System.out.println(Queueusing2Stacks.Queue.peek());
            Queueusing2Stacks.Queue.remove();
        }
    }
}
