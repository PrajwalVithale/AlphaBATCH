import java.util.Scanner;

public class Binomial{
    public static int Binomial(int n,int r){
        int x=1;
        int y=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }
        for(int j=1;j<=r;j++){
            y=y*j;
        }
        int z=1;
        for(int k=1;k<=(n-r);k++){
            z=z*k;
        }

        int bin=x/(y*z);
        return bin;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter second Number: ");
        int r=sc.nextInt();
        int b=Binomial(n,r);
        System.out.println("Binomial of number: "+b);
    }
}
