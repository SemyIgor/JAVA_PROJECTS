package Seminar01;

import java.util.Scanner;

public class HWTask04 {
   public static void main(String[] args) {
      /*
       * *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
       * заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
       * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
       * что его нет.
       */

      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите Ваш пример X+Y=Z, заменив некоторые цифры знаком '?':\n");
      String str = iScanner.nextLine();
      iScanner.close();

      // Gets elements of the task into strings apart
      // (first and second addendums and sum)
      String x1 = GetFirstNumber(str);
      String y1 = GetSecondNumber(str);
      String z1 = GetSumNumber(str);

      // Equalize the number of digits of the addendums with the number of digits in
      // the sum number by adding 0
      x1 = EqualLength(x1, z1);
      y1 = EqualLength(y1, z1);

      // Declare the char arrays
      char[] xch = new char[x1.toCharArray().length];
      char[] ych = new char[y1.toCharArray().length];
      char[] zch = new char[z1.toCharArray().length];

      // Turn string elements into char arrays
      xch = x1.toCharArray();
      ych = y1.toCharArray();
      zch = z1.toCharArray();

      // Max length of the numbers
      int zchLength = zch.length;

      // Some logics
      boolean solveProblem = true;
      for (int i = zchLength - 1; i >= 0; i--) {
         if (CanFixX(xch[i], ych[i], zch[i])) {
            xch[i] = FixXY(ych[i], zch[i]);
            if (Character.getNumericValue(zch[i]) -
                  Character.getNumericValue(ych[i]) < 0) {
               zch[i - 1]--;
            }
         } else if (CanFixY(xch[i], ych[i], zch[i])) {
            ych[i] = FixXY(xch[i], zch[i]);
            if (Character.getNumericValue(zch[i]) -
                  Character.getNumericValue(xch[i]) < 0) {
               zch[i - 1]--;
            }
            // CODE BLOCK IS UNDER RECONSTRACTION !!!
            // =============================================================
            // } else if (xch[i] == '?' && ych[i] == '?' && zch[i] != '?') {
            // xch[i] = '1';
            // ych[i] = (char) ((Character.getNumericValue(
            // zch[i]) - Character.getNumericValue(xch[i])) + '0');
            // -------------------------------------------------------------
         } else if (xch[i] != '?' && ych[i] != '?' && zch[i] != '?') {
            continue;
         } else {
            // System.out.println("Увы, не удалось найти решение :-(");
            solveProblem = false;
         }
      }

      // Reconstract sum
      zch = z1.toCharArray();

      // Converts char arrays to strings for better printing
      String xs = new String(xch);
      String ys = new String(ych);
      String zs = new String(zch);

      if (solveProblem) {
         System.out.printf("%d + %d = %d", Integer.parseInt(xs), Integer.parseInt(ys), Integer.parseInt(zs));
      } else {
         System.out.println("Увы, не удалось найти решение :-(");
      }

   }

   // Gets first addendum
   static String GetFirstNumber(String s) {
      String x = s.substring(0, s.indexOf('+')).trim(); //
      return x; //
   }

   // Gets second addendum
   static String GetSecondNumber(String s) {
      String y = s.substring(s.indexOf('+') + 1, s.indexOf('=')).trim(); //
      return y; //
   }

   // Gets sum
   static String GetSumNumber(String s) {
      String z = s.substring(s.indexOf('=') + 1).trim(); //
      return z; //
   }

   static String EqualLength(String add, String z) {
      if (add.length() == z.length()) {
         return add;
      } else {
         for (int i = add.length(); i < z.length(); i++) {
            add = '0' + add;
         }
      }
      return add;
   }

   // Checks if we can fix first addendum
   static boolean CanFixX(char x, char y, char z) {
      if (x == '?' && y != '?' && z != '?') {
         return true;
      }
      return false;
   }

   // Checks if we can fix second addendum
   static boolean CanFixY(char x, char y, char z) {
      if (x != '?' && y == '?' && z != '?') {
         return true;
      }
      return false;
   }

   // Fixing of the first or second addendum
   static char FixXY(char add, char z) {
      if (Character.getNumericValue(z) -
            Character.getNumericValue(add) >= 0) {
         return (char) ((Character.getNumericValue(z) -
               Character.getNumericValue(add)) + '0');
      }
      // If the sum digit is less than two terms digits sum
      return (char) (((Character.getNumericValue(z) + 10) -
            Character.getNumericValue(add)) + '0');
   }

}
