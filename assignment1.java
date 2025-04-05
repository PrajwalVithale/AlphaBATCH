import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1

        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // float avg=(a+b+c)/3;
        // System.out.println("Aerage is : "+avg);

        //2

        // int l=sc.nextInt();
        // System.out.println("Area Of Square: "+(l*l));

        //3

        System.out.println("Pencil: ");
        float pencil=sc.nextFloat();
        System.out.println("Pen");
        float pen=sc.nextFloat();
        System.out.println("Eraser");
        float Eraser=sc.nextFloat();

        float total=(((pencil+pen+Eraser)*18)/100);
        System.out.println("Total with 18% GST is: "+total);
        sc.close();;
    }
}
