package Seminar05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HWTask03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.printf("Введите число в римском формате:\n");
      String romeString = sc.nextLine();
      sc.close();
      char[] romeDigits = new char[romeString.length()];
      romeDigits = romeString.toCharArray();
      int pointer = 0;
      // Map<String, Integer> romeArabMap = new LinkedHashMap<>();
      Map<Character, Integer> romeArabMap = new HashMap<>();
      romeArabMap.put('I', 1);
      romeArabMap.put('V', 5);
      romeArabMap.put('X', 10);
      romeArabMap.put('L', 50);
      romeArabMap.put('C', 100);
      romeArabMap.put('D', 500);
      romeArabMap.put('M', 1000);

      int decimalNumber = romeArabMap.get(romeDigits[pointer]);

      if (!forbiddenMix(romeDigits)) {
         do {
            // If the next digit is greater than the specified
            if (romeArabMap.get(romeDigits[pointer]) >= romeArabMap.get(romeDigits[pointer + 1])) {
               decimalNumber = decimalNumber + romeArabMap.get(romeDigits[pointer + 1]);
               pointer++;
               // Else if the next digit is less than the specified
            } else if (romeArabMap.get(romeDigits[pointer]) < romeArabMap.get(romeDigits[pointer + 1])) {
               decimalNumber = decimalNumber + romeArabMap.get(romeDigits[pointer + 1])
                     - 2 * romeArabMap.get(romeDigits[pointer]);
               pointer++;
            }

         } while (pointer < romeDigits.length - 1);

         System.out.printf("Десятичное = %d", decimalNumber);
      }
   }

   static boolean forbiddenMix(char[] ch) {
      // Checks if there are more then 3 the same digits
      if (ch.length > 3) {
         for (int i = 0; i < ch.length - 3; i++) {
            if (ch[i] == ch[i + 1] && ch[i] == ch[i + 2] && ch[i] == ch[i + 3]) {
               System.out.println("Слишком много одинаковых цифр");
               return true;
            }
         }
      }
      // Checks if there are duble V, L or D
      if (ch.length > 1) {
         for (int i = 0; i < ch.length - 1; i++) {
            if (((ch[i] == 'V') && (ch[i + 1] == 'V'))
                  || ((ch[i] == 'L') && (ch[i + 1] == 'L'))
                  || ((ch[i] == 'D') && (ch[i + 1] == 'D'))) {
               System.out.println("Дубляж V, L или D недопустим");
               return true;
            }
         }
      }
      return false;
   }
}

/*
 * Написать метод, который переведет число из римского формата записи в
 * арабский. Например, MMXXII = 2022 (правила см. во вложениях к уроку, где
 * ссылка на репозиторий).
 */
/*
 * MCMLXXXIV = 1984
 * MMXXII = 2022
 * XVII = 17
 * XXIX = 29
 * MCCCLXXIV = 1374
 * MCDLXXIV = 1474
 */