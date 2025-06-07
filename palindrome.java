public class palindrome{

    public static void isPalindrome(String x){
        String rev="";
        for(int i=x.length()-1;i>=0;i--){
            rev+=x.charAt(i);
        }
        // System.out.println(rev);
        // System.out.println(x);

        if(x.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        String x="noon";
        isPalindrome(x);
    }
}