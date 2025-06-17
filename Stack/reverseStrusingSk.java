package Stack;
import java.util.*;

public class reverseStrusingSk {

    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb=new StringBuilder();
        while (!s.isEmpty()) {
            char c=s.pop();
            sb.append(c);
        }
        String result=sb.toString();
        return result;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(reverseString(str));
    }
}
