package Seminar01;

import java.util.Scanner;

public class HWTask03 {
   public static void main(String[] args) {
      /*
       * Реализовать простой калькулятор
       */
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите пример (возможно +,-,*,/) по форме X+Y: ");
      String str = iScanner.nextLine();
      iScanner.close();

      if (str.indexOf('+') != -1) {
         sum(getFirstNumber(str, '+'), getSecondNumber(str, '+'));
      } else if (str.indexOf('-') != -1) {
         sub(getFirstNumber(str, '-'), getSecondNumber(str, '-'));
      } else if (str.indexOf('*') != -1) {
         mul(getFirstNumber(str, '*'), getSecondNumber(str, '*'));
      } else if (str.indexOf('/') != -1) {
         div(getFirstNumber(str, '/'), getSecondNumber(str, '/'));
      } else {
         System.out.println("Ошибка !");
      }

   }

   static float getFirstNumber(String s, char c) {
      String x = s.substring(0, s.indexOf(c)).trim(); //
      return Float.parseFloat(x); //
   }

   static float getSecondNumber(String s, char c) {
      String x = s.substring(s.indexOf(c) + 1).trim(); //
      return Float.parseFloat(x); //
   }

   static void sum(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f", x, '+', y, x + y);
   }

   static void sub(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f", x, '-', y, x - y);
   }

   static void mul(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f", x, '*', y, x * y);
   }

   static void div(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f", x, '/', y, x / y);
   }
}
