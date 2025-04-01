import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        int c=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                c=c+1;
            }
        }
        if(c<=2){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
