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
            Calculator.sum(Calculator.getFirstNumber(str, '+'), Calculator.getSecondNumber(str, '+'));
            stack.push(str);
         } else if (str.indexOf('-') != -1) {
            Calculator.sub(Calculator.getFirstNumber(str, '-'), Calculator.getSecondNumber(str, '-'));
            stack.push(str);
         } else if (str.indexOf('*') != -1) {
            Calculator.mul(Calculator.getFirstNumber(str, '*'), Calculator.getSecondNumber(str, '*'));
            stack.push(str);
         } else if (str.indexOf('/') != -1) {
            Calculator.div(Calculator.getFirstNumber(str, '/'), Calculator.getSecondNumber(str, '/'));
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
}

/*
 * * В калькулятор добавьте возможность отменить последнюю операцию.
 */