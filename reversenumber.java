import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int x=sc.nextInt();
        //int x=6549;
        int y;
        
        String j=Integer.toString(x);
        for(int i=0;i<j.length();i++){
            y=x%10;      
            System.out.print(y);
            x=x/10;
        }
        //System.out.println("Reversed : "  );
    }
}
