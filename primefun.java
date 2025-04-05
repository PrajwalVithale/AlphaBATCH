import java.util.Scanner;
//import java.util.math;

public class primefun {
    
    // public boolean prime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //    // boolean flag=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             //flag=false;
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //optimized approach

    public boolean prime(int n){
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


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n:");
        int n=sc.nextInt();
        primefun pm=new primefun();
        boolean x=pm.prime(n);
        if(x==true){
            System.out.println("Prime number ");
        }
        else{
            System.out.println("Not a prime");
        }
        sc.close();
    }
}
