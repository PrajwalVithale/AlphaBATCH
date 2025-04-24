public class setithBit {
    public static int setithBith(int num,int i){
        int Bitmask=(1<<i);
        return num|Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setithBith(10, 2));
    }
}
