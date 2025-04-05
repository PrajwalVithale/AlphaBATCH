import java.util.Scanner;

public class primefun {
    public boolean prime(int n){
        boolean flag=true;
        for(int i=2;i<=n-1;i++){
            if(n/i==0){
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primefun pm=new primefun();
        boolean x=pm.prime(n);
        if(x==false){
            System.out.println("Prime number ");
        }
        else{
            System.out.println("Not a prime");
        }
        sc.close();
    }
}
