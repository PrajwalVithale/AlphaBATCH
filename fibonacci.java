public class fibonacci {

    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1=fibo(n-1);
        int fibnm2=fibo(n-2);
        int fib=fibnm1+fibnm2;

        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo(11));
        System.out.println(fibo(12));
        System.out.println(fibo(13));
    }
}
