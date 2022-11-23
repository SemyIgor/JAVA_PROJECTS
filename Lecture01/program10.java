public class program10 {
   public static void main(String[] args) {
      /*
       * ФОРМАТИРОВАННЫЙ ВЫВОД (продолжение)
       * Количество знаков после запятой
       */
      float pi = 3.1415f;
      System.out.printf("%f\n", pi); // 3,141500
      System.out.printf("%.2f\n", pi); // 3,14
      System.out.printf("%.3f\n", pi); // 3,141
      System.out.printf("%e\n", pi); // 3,141500e+00
      System.out.printf("%.2e\n", pi); // 3,14e+00
      System.out.printf("%.3e\n", pi); // 3,141e+00

   }
}
