import java.util.Scanner;

public class Binomial{

    public static int factorial(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }
        return x;
    }

    public static int binomial(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int bincoefficient=fact_n/(fact_r*fact_nmr);
        return bincoefficient;
    }
    //     int x=1;
    //     int y=1;
    //     for(int i=1;i<=n;i++){
    //         x=x*i;
    //     }
    //     for(int j=1;j<=r;j++){
    //         y=y*j;
    //     }
    //     int z=1;
    //     for(int k=1;k<=(n-r);k++){
    //         z=z*k;
    //     }

    //     int bin=x/(y*z);
    //     return bin;
    // }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter second Number: ");
        int r=sc.nextInt();
        int b=binomial(n,r);
        System.out.println("Binomial of number: "+b);
        sc.close();
    }
}
