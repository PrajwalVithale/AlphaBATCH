import java.util.Scanner;

public class add2number {
    public static int addNum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st number: ");
        int x=sc.nextInt();
        System.out.println("2nd number: ");
        int y=sc.nextInt();

        int c=addNum(x, y);
        System.out.println("Sum is :"+c);
    }
}
