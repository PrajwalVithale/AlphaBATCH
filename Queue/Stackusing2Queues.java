package Queue;
import java.util.*;

public class Stackusing2Queues {
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void add(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }

            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

         public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }

            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        //Stack s=new Stack();
        Stackusing2Queues.Stack.add(1);
        Stackusing2Queues.Stack.add(2);
        Stackusing2Queues.Stack.add(3);
        Stackusing2Queues.Stack.add(4);

        while(!Stackusing2Queues.Stack.isEmpty()){
            System.out.println(Stackusing2Queues.Stack.peek());
            Stackusing2Queues.Stack.remove();
        }
    }
}
