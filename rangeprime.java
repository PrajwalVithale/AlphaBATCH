import java.util.Scanner;

public class rangeprime {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n:");
        int n=sc.nextInt();
        primeRange(n);
        sc.close();
    }
}
