import java.util.Scanner;

public class BinToDec {
    public static void binTodec(int binnum){
        int mynum=binnum;
        int power=0;
        int decNum=0;

        while (binnum>0) {
            int lastdigit=binnum%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,power));
            power++;
            binnum=binnum/10;
        }

        System.out.println("decimal of "+mynum+" is = "+decNum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        binTodec(n);
        sc.close();
    }
}
