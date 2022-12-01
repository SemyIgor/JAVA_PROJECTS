package Lecture02;

public class program02 {
   public static void main(String[] args) {
      // РАБОТА СО СТРОКОЙ
      String[] name = { "С", "е", "р", "г", "е", "й" };
      String sk = "СЕРГЕЙ КА.";
      System.out.println(sk.toLowerCase()); // сергей ка.
      System.out.println(String.join("", name)); // Сергей
      System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
      System.out.println(String.join(",", "С", "е", "р", "г", "е", "й")); // С,е,р,г,е,й
   }
}
