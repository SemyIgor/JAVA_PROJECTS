import java.util.Scanner;

public class program06 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("int a: ");
      int x = iScanner.nextInt(); // 5 (вводим число с типом int) 
      System.out.printf("double a: ");
      double y = iScanner.nextDouble(); // 17 (вводим число с типом double)
      System.out.printf("%d + %f = %f", x, y, x + y); // 5 + 17,000000 = 22,000000
      iScanner.close();

   }
}
