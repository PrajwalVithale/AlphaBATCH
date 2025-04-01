import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter Number: ");
            n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }
        System.out.println("Out of loop(multiple of 10) ->"+n); 
    }
}
