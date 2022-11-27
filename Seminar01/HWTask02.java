package Seminar01;

public class HWTask02 {
   public static void main(String[] args) {
      // Вывести все простые числа от 1 до 1000
      int counter = 0;
      System.out.printf("%d ", 2);
      for (int i = 3; i < 1000; i += 2) {
         if (isSimple(i)) {
            System.out.printf("%d ", i);
            counter++;
         }
      }
      System.out.println();
      System.out.printf("В диапазоне от 1 до 1000 существует %d простых чисел", counter);
   }

   static boolean isSimple(int n) {
      for (int i = 2; (i - 1) * (i - 1) <= n; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }
}
