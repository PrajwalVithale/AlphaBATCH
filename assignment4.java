import java.util.Scanner;

public class assignment4 {

    //1
    public static double avg(int a, int b,int c){
        double avg=(a+b+c)/3;
        return avg;
    }
    //2
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    //3
    public static boolean palindrome(int n){
        int palindrome=n;
        int rev=0;
        while(palindrome!=0){
            int rem=palindrome%10;
            rev=rev*10+rem;
            palindrome=palindrome/10;
        }

        if(n==rev){
            return true;
        }
        return false;
    }
    //5
    public static int sumOfDig(int n){
        int number=n;
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("1st: ");
        // int x=sc.nextInt();
        // System.out.print("2nd: ");
        // int y=sc.nextInt();
        // System.out.print("3rd: ");
        // int z=sc.nextInt();
        // System.out.println("average is: "+avg(x, y, z));

        // System.out.print("Enter number: ");
        // int n=sc.nextInt();
        // System.out.println(isEven(n));

        // System.out.print("Enter number: ");
        // int n=sc.nextInt();
        //System.out.println(palindrome(n));
        // if(palindrome(n)==true){
        //     System.out.println("number "+n+" is palindrome");
        // }
        // else{
        //     System.out.println("Number "+n+" Not a palindrome");
        // }

        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("sum of digits "+n+" is = "+sumOfDig(n));
        sc.close();
    }
}
