import java.util.Scanner;

public class program20 {
   public static void main(String[] args) {
      /*
       * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
       * Вычислить n! (произведение чисел от 1 до n)
       */
      // Input max number
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите число: ");
      int num = iScanner.nextInt();
      iScanner.close();
      // Find triangle number
      float triNumber = (num * num * num - num) / 6;
      System.out.println(triNumber);
      // Find factorial
      // int a = 5;
      // int b = 15;
      // int c = a + b;
      // System.out.println(c);
   }
}
