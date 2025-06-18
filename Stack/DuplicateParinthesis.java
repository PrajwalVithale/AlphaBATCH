package Stack;
import java.util.*;

public class DuplicateParinthesis {

    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            if(ch==')'){
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }

            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)";
        System.out.println(isDuplicate(str));
    }
}
