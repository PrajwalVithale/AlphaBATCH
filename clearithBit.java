public class clearithBit {
    public static int clreithBit(int num,int i){
        int Bitmask=~(1<<i);
        return num&Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clreithBit(10, 1));
    }
}
