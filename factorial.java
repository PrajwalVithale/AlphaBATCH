import java.util.Scanner;

public class factorial {

    public static int Factorial(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int z=Factorial(n);
        System.out.println("FActorial :"+z);
    }
}
