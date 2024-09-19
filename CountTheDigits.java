import java.util.Scanner;

public class CountTheDigits {
   
   public static int digitCount(int intInput) {
      if (intInput == 0){
         return 1;
      }
      if (intInput / 10 == 0) {
         return 1;
      }
      else {
         return 1 + digitCount(intInput / 10);
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
      scnr.close();
   }
}
