import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
    
        Scanner sc1 = new Scanner(System.in);
        short collageName=sc1.nextShort();
        //nextInt()
        //nextBoolean()
        //nextFloat()
        //nextLine()
        //nextDouble()

        System.out.println("Name: "+name+" collage name: "+collageName);
        sc.close();
        sc1.close();
    }
}
