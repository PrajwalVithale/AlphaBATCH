import java.util.Arrays;

public class assignment8 {

    //1
    public static int CountVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
                count++;
            }
        }
        return count;
    }

    //2
    public static void Solution2(){
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));
    }

    //3
    public static void Solution3(){
        String str="ApnaCollege".replace("l","");
        System.out.println(str);
    }

    //4
    public static void anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1c=str1.toCharArray();
            char[] str2c=str2.toCharArray();

            Arrays.sort(str1c);
            Arrays.sort(str2c);

            boolean result=Arrays.equals(str1c,str2c);

            if(result){
                System.out.println("Both are Anagrams");
            }else{
                System.out.println("Both are Not Anangrams");
            }
        }
        else{
            System.out.println("Both are Not Anangrams");
        }
    }
    public static void main(String[] args) {
        //String str="Prajwal Vithale";
        //System.out.println(CountVowels(str));
        //Solution2();
        //Solution3();
        String str1="eartha";
        String str2="hearta";
        anagram(str1, str2);
    }
}
