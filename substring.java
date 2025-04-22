public class substring {

    public static String subString(String str,int si,int ei){
        String sub="";
        for(int i=si;i<ei;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        //method
        System.out.println(str.substring(2,7));
        //function
        System.out.println(subString(str, 0, 5));
    }
}
