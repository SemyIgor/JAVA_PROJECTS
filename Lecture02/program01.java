package Lecture02;

public class program01 {
   public static void main(String[] args) {
      // ВРЕМЯ РАБОТЫ ПРОГРАММЫ
      System.out.println("Hi !");
      // This code runs ~41 second
      // String str = "";
      // for (int i = 0; i < 1_000_000; i++) {
      // str += "+";
      // }
      // Using String Builder this task should be solved for 9 msec
      // ==================================================
      var s = System.currentTimeMillis();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 1_000_000; i++) {
         sb.append("+");
      }
      System.out.println(System.currentTimeMillis() - s);
   }
}
