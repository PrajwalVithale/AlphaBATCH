package HeapsAndHashing;

import java.util.Scanner;

public class primeAnsComposit {

    public static boolean isprime(int n){
        if(n<1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range: ");
        int n=sc.nextInt();
        System.out.println("prime Numbers");
        for(int i=2;i<=n;i++){
           if(isprime(i)){
            System.out.print(i+" ");
           }
        }
        System.out.println();
         System.out.println("composite Numbers");
         for(int i=2;i<=n;i++){
           if(!isprime(i)){
            System.out.print(i+" ");
           }
        }
        sc.close();
    }
}
