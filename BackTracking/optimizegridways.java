package BackTracking;

public class optimizegridways {

    public static long printFact(int n){
        if(n==0){
            return 1;
        }
        long Fact=printFact(n-1);
        Fact=n*printFact(n-1);
        return Fact;
    }

    public static long gridways(int n,int m){

        return printFact(n+m-2)/(printFact(n-1)*printFact(m-1));
    }
    public static void main(String[] args) {
        int n=10,m=10;
        System.out.println(gridways(n,m));
    }
}
