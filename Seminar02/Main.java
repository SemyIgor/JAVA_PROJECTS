import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Start point of the Task01
      // =================================================
      // Sem02Task01 sem02Task01 = new Sem02Task01();
      // // StringBuilder result = sem02Task01.getResult();
      // System.out.println(sem02Task01.getResult());

      // Start point of the Task02
      // =================================================
      // Sem02Task02 sem02Task02 = new Sem02Task02();
      // System.out.println(sem02Task02.getUniqString());

      // Task03 (Runs directly from the Main{} class)
      /*
       * Напишите метод, который принимает на вход строку (String)
       * и определяет, является ли строка полиндромом (возвращает boolean значение)
       */
      // Scanner in = new Scanner(System.in);
      // String string = in.next();
      // in.close();
      // System.out.println(isPalindrom(string));

      // Start point of the Task04
      // =================================================
      Sem02Task04 sem02Task04 = new Sem02Task04();
      sem02Task04.writer();
   }

   // Static (Main) can run static methods only.
   // Consequently, isPalindrom() should be static too.
   public static boolean isPalindrom(String string) {
      return string.equals((new StringBuilder(string)).reverse().toString());
   }
}

/*
 * Дано чётное число N (N>0) и символы c1 и c2.
 * Написать метод, который вернёт строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */

/*
 * String - produces new strings when there are changes to that initial string
 * StringBuilder does not have the disadvantages of the String method, but it
 * cannot be used in a multithreaded process.
 * StringBuffer does not have the drawbacks of the String method and can be used
 * in a multi-threaded process.
 */

// Declare class
class Sem02Task01 {
   int n;
   char a;
   char b;
   int counter = 0;

   // Building constructor
   Sem02Task01() {
      // Open scanner
      Scanner in = new Scanner(System.in);
      // Prepare to get an int number (N)
      n = in.nextInt();
      // Not usint nextLine or nextString to avoid redundent bytes
      // next() gives string and charAt gives the character with index = 0 of this
      // string
      a = in.next().charAt(0);
      b = in.next().charAt(0);
      in.close();
   }

   // Method of the class Sem02Task01
   public StringBuilder getResult() {
      StringBuilder result = new StringBuilder();
      while (n != counter) {
         result.append(a).append(b);
         counter += 2;
      }
      return result;
   }
}

// Напишите метод, который сжимает строку. Пример: вход - aaaabbbcdc; выход -
// abcd
class Sem02Task02 {
   String string;
   boolean repeated;

   Sem02Task02() {
      Scanner in = new Scanner(System.in);
      string = in.next();
      in.close();
   }

   public StringBuilder getUniqString() {
      StringBuilder result = new StringBuilder();
      char[] chars = string.toCharArray();
      for (int i = 0; i < chars.length; i++) {
         repeated = false;
         for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
               repeated = true;
               break;
            }
         }
         if (!repeated) {
            result.append(chars[i]);
         }
      }
      return result;
   }
}

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод, который запишет эту строку в простой текстовый файл.
 * Обработайте исключения.
 */

class Sem02Task04 {
   String string;

   public StringBuilder generateString() {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < 100; i++) {
         stringBuilder.append("TEST ");
      }
      return stringBuilder;
   }

   public void writer() {
      try {
         FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
         fileOutputStream.write(generateString().toString().getBytes());
         fileOutputStream.close();
      } catch (IOException e) {
         System.out.println("Ошибка записи в файл");
         System.out.println(e.getMessage());
         // Или:
         e.printStackTrace(); // Более подробная информация
      } finally {
      }
   }
}
