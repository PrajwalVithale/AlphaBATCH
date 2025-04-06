import java.util.Scanner;

public class DecToBin {
    public static void decTobin(int decnum){
        int mynum=decnum;
        int power=0;
        int biNum=0;

        while (decnum>0) {
            int rem=decnum%2;
            biNum=biNum+(rem * (int)Math.pow(10,power));
            power++;
            decnum=decnum/2;
        }

        System.out.println("binary of "+mynum+" is = "+biNum);
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        decTobin(n);
        sc.close();
    }
}
