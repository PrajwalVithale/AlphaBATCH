public class factRec {
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int Fact=printFact(n-1);
        Fact=n*printFact(n-1);
        return Fact;
    }
    public static void main(String[] args) {
        System.out.println(printFact(5));
    }
}
