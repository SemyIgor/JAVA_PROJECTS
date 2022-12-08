package Seminar04;

public class Calculator {
   static float getFirstNumber(String s, char c) {
      String x = s.substring(0, s.indexOf(c)).trim(); //
      return Float.parseFloat(x); //
   }

   static float getSecondNumber(String s, char c) {
      String x = s.substring(s.indexOf(c) + 1).trim(); //
      return Float.parseFloat(x); //
   }

   static void sum(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n\n", x, '+', y, x + y);
   }

   static void sub(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n\n", x, '-', y, x - y);
   }

   static void mul(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n\n", x, '*', y, x * y);
   }

   static void div(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n\n", x, '/', y, x / y);
   }
}
