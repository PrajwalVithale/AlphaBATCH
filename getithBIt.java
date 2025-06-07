public class getithBIt {
    public static int ithBith(int num,int i){
        int Bitmask=(1<<i);
        if((num&Bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(ithBith(10,3));
    }
}
