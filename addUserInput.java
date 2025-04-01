import java.util.Scanner;

public class addUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("first Number: ");
        int a=sc.nextInt();
        System.out.print("Second Number: ");
        int b=sc.nextInt();
        System.out.println("sum is :"+(a+b));
        System.out.println("Substraction is :"+(a-b));
        System.out.println("Product is: "+(a*b));
        System.out.println("Divide is: "+(a/b));
    }
}
