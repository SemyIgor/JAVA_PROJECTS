package Seminar04;

import java.util.Scanner;
import java.util.Stack;

public class HWTask03 {
   public static void main(String[] args) {

      String str;
      Stack<Object> stack = new Stack<>();
      System.out.print("\033[H\033[J");
      do {

         Scanner iScanner = new Scanner(System.in);
         System.out.printf("Введите пример (возможно +,-,*,/) по форме X+Y: ");
         System.out.printf("\nДля просмотра истории введите history()");
         System.out.printf("\nДля отмены операции введите cancel()\n");
         str = iScanner.nextLine();
         // iScanner.close();

         if (str.indexOf('+') != -1) {
            sum(getFirstNumber(str, '+'), getSecondNumber(str, '+'));
            stack.push(str);
         } else if (str.indexOf('-') != -1) {
            sub(getFirstNumber(str, '-'), getSecondNumber(str, '-'));
            stack.push(str);
         } else if (str.indexOf('*') != -1) {
            mul(getFirstNumber(str, '*'), getSecondNumber(str, '*'));
            stack.push(str);
         } else if (str.indexOf('/') != -1) {
            div(getFirstNumber(str, '/'), getSecondNumber(str, '/'));
            stack.push(str);
         } else if (str.equals("history()")) {
            System.out.println(stack);
            System.out.println();
         } else if (str.equals("cancel()")) {
            if (!stack.isEmpty()) {
               stack.pop();
               System.out.println();
            } else {
               System.out.println("Очередь операций пуста\n");
               // continue;
            }
         } else {
            str = "q";
         }

      } while (!str.equals("q") && !str.equals("Q"));
      // iScanner.close();

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

/*
 * * В калькулятор добавьте возможность отменить последнюю операцию.
 */