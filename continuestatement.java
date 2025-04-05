import java.util.Scanner;

public class continuestatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter Number:(break enter 0) ");
            n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while (true); 
        sc.close();
    }  
}

