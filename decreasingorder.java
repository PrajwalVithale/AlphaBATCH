public class decreasingorder {
    public static void decreaseNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decreaseNumber(n-1);
    }
    public static void main(String[] args) {
        decreaseNumber(10);
    }
}
