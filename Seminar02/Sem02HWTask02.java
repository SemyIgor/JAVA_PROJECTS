import java.io.IOException;
import java.util.Arrays;
// import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem02HWTask02 {
   public static void main(String[] args) throws IOException {
      // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
      // каждой итерации запишите в лог-файл.
      int[] array = new int[] { 3, 1, 5, 0, 7, 9, 8 };

      Logger logger = Logger.getLogger(Sem02HWTask02.class.getName());
      FileHandler fh = new FileHandler("bubblelog.txt");
      logger.addHandler(fh);

      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);

      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
               logger.log(Level.INFO, "Итерация " + Arrays.toString(array));
            }
         }
      }
      for (int k = 0; k < array.length; k++) {
         System.out.printf("%d ", array[k]);
      }
      logger.log(Level.INFO, "Завершение программы.");
   }
}
