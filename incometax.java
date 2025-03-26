import java.util.Scanner;

public class incometax {
   public incometax() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      float var3;
      if (var2 <= 500000) {
         var3 = (float)var2;
         System.out.println("No tax: " + var3);
      } else if (var2 > 500000 && var2 <= 1000000) {
         var3 = (float)var2 - (float)var2 * 0.2F;
         System.out.println("After 20% tax: " + var3);
      } else {
         var3 = (float)var2 - (float)var2 * 0.3F;
         System.out.println("After 30% tax: " + var3);
      }

   }
}
