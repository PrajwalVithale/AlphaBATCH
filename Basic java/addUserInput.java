import java.util.Scanner;

public class addUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("first Number: ");
        int a=sc.nextInt();
        System.out.println("Second Number: ");
        int b=sc.nextInt();
        System.out.println("sum is :"+(a+b));
    }
}
