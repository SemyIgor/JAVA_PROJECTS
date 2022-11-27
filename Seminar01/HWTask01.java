package Seminar01;

import java.util.Scanner;

public class HWTask01 {
   public static void main(String[] args) {
      /*
       * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
       * Вычислить n! (произведение чисел от 1 до n)
       */
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите число: ");
      int num = iScanner.nextInt();
      iScanner.close();
      // Find triangle number
      int triNumber = num * (num + 1) / 2;
      System.out.printf("Треугольное число от %d равно %d", num, triNumber);
      System.out.println();

      double fucNumber = factor(num);
      System.out.printf("Факториал числа %d равен %.0f", num, fucNumber);

   }

   static double factor(int n) {
      if (n == 1 || n == 0)
         return 1;
      return n * factor(n - 1);
   }
}
