public class FastExponential {
    public static int fasterExponential(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fasterExponential(5, 3));
    }
}
