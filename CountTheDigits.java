import java.util.Scanner;

public class CountTheDigits {
   
   /* TODO: Write recursive digitCount() method here. */
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
   }
}
