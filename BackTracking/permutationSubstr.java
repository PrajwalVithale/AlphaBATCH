package BackTracking;

public class permutationSubstr {

    public static void findpermsubset(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewStr=str.substring(0, i)+str.substring(i+1);
            findpermsubset(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        findpermsubset(str, "");
    }
}
