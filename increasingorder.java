public class increasingorder {
    public static void increasingNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasingNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        increasingNumber(10);
    }
}
