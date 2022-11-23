public class program14 {
   public static void main(String[] args) {
      // ЦИКЛЫ
      int value = 321;
      int count = 0;

      // while
      while (value != 0) {
         value /= 10;
         count++;
      }
      System.out.println(count); // 3

      // do while
      do {
         value /= 10;
         count++;
      } while (value != 0);
      System.out.println(count); // 4

      // for
      int s = 0;
      for (int i = 1; i <= 10; i++) {
         s += i;
      }
      System.out.println(s); // 55

      // for:
      // Работает только для коллекций
      int[] arr = new int[10];
      for (int item : arr) {
         arr[3] = 12; // 10 раз в цикле присваивает значение 12 элементу с индексом 3
         System.out.printf("%d ", item); // 0 0 0 12 0 0 0 0 0 0
      }
      System.out.println();
      // Примечание: item - это временная переменная, а не элемент массива.
      // Поэтому нельзя в цикле присвоить значение элементу массива, используя item =
      // value.
      // Надо использовать arr[i] = value
   }
}
