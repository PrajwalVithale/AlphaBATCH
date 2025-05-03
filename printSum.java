public class printSum {
    public static int printNoSum(int n){
        if(n==1){
            return 1;
        }
        int sum=printNoSum(n-1);
        sum=n+printNoSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printNoSum(5));
    }
}
