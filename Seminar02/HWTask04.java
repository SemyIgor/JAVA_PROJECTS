import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HWTask04 {
   public static void main(String[] args) throws IOException {
      // К калькулятору из предыдущего дз добавить логирование.

      Logger logger = Logger.getLogger(HWTask04.class.getName());
      // ConsoleHandler ch = new ConsoleHandler();
      FileHandler fh = new FileHandler("log.txt");
      // logger.addHandler(ch);
      logger.addHandler(fh);

      SimpleFormatter sFormat = new SimpleFormatter();
      // XMLFormatter xml = new XMLFormatter();
      fh.setFormatter(sFormat);
      // fh.setFormatter(hml);

      // logger.setLevel(Level.INFO);
      logger.log(Level.WARNING, "Внимание! Запуск программы.");
      // logger.info("Тестовое логирование 2");

      Scanner iScanner = new Scanner(System.in);
      System.out.printf("Введите пример (возможно +,-,*,/) по форме X+Y: ");
      String str = iScanner.nextLine();
      iScanner.close();

      if (str.indexOf('+') != -1) {
         sum(getFirstNumber(str, '+'), getSecondNumber(str, '+'));
         logger.info("Сложение ОК");
      } else if (str.indexOf('-') != -1) {
         sub(getFirstNumber(str, '-'), getSecondNumber(str, '-'));
         logger.info("Вычитание ОК");
      } else if (str.indexOf('*') != -1) {
         mul(getFirstNumber(str, '*'), getSecondNumber(str, '*'));
         logger.info("Умножение ОК");
      } else if (str.indexOf('/') != -1) {
         div(getFirstNumber(str, '/'), getSecondNumber(str, '/'));
         logger.info("Умножение ОК");
      } else {
         System.out.println("Ошибка !");
         logger.log(Level.WARNING, "Зафиксирована ошибка");
      }
      logger.log(Level.WARNING, "Зафиксирован выход из программы");
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
      System.out.printf("%.2f %c %.2f = %.2f\n", x, '+', y, x + y);
   }

   static void sub(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n", x, '-', y, x - y);
   }

   static void mul(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n", x, '*', y, x * y);
   }

   static void div(float x, float y) {
      System.out.printf("%.2f %c %.2f = %.2f\n", x, '/', y, x / y);
   }

}
