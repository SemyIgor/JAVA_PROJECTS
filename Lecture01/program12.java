public class program12 {
   // ФУНКЦИЯ В ОТДЕЛЬНОМ ФАЙЛЕ
   // Функция sayHi() вынесена в отдельный файл lib.java, обращение к ней (строка
   // 19) lib.sayHi()
   // Для запуска в командной строке пишем: javac program12.java && java program12
   // static void sayHi() {
   // System.out.println("Hi!");
   // }

   static int sum(int a, int b) {
      return a + b;
   }

   static double factor(int n) {
      if (n == 1 || n == 0)
         return 1;
      return n * factor(n - 1);
   }

   public static void main(String[] args) {
      lib.sayHi(); // Hi!
      System.out.println(sum(1, 3)); // 4
      System.out.println(factor(5)); // 120
   }
}
