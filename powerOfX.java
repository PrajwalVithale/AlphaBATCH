public class powerOfX {
    //O(n)
    public static int powerOfNumber(int x,int n){
        if(n==0){
            return 1;
        }

        return x*powerOfNumber(x, n-1);
    }
    //O(logn)
    public static int OptimalPowerNumber(int x,int n){
        if(n==0){
            return 1;
        }

        int half=OptimalPowerNumber(x, n/2);
        int halfsq=half*half;

        if(n%2!=0){
            return x*halfsq;
        }
        return halfsq;
    }
    public static void main(String[] args) {
        int x=5;
        int y=3;
        //System.out.println(powerOfNumber(x, y));
        System.out.println(OptimalPowerNumber(x, y));
    }
}
