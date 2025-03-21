import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
    
        Scanner sc1 = new Scanner(System.in);
        String collageName=sc1.nextLine();
        System.out.println("Name: "+name+" collage name: "+collageName);
    }
}
