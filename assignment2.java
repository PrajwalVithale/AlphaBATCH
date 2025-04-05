import java.util.Scanner;

public class assignment2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1
        // System.out.println("enter number:");
        // int x=sc.nextInt();

        // if(x>=0){
        //     System.out.println("Positive Number "+x);
        // }
        // else{
        //     System.out.println("Negative Number "+x);
        // }


        //2
        // double temp=103.5;
        // if(temp>100){
        //     System.out.println("You Have Fever "+temp);
        // }
        // else{
        //     System.out.println("you don't have Fever");
        // }


        //3
        // System.out.println("Enter number(1-7):");
        // int w=sc.nextInt();

        // switch (w) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednessday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //     System.out.println("Invalid input!");
        //         break;
        //}


        //4
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x+" "+y);


        //5
        System.out.println("enter year:");
        int y=sc.nextInt();

        if(y%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Non leap Year!");
        }
        sc.close();
    }
}