package Stack;
import java.util.*;

public class nextGreaterProblem {
    public static void main(String[] args) {
        int arr[]={6,5,0,3,2,4};
        Stack<Integer> s=new Stack<>();
        int nxtgreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtgreater[i]=-1;
            }
            else{
                nxtgreater[i]=arr[s.peek()];
            }

            //push
            s.push(i);
        }

        for(int i=0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+" ");
        }
        System.out.println();
    }
}
