public class program04 {
   public static void main(String[] args) {
      // Неявное преобразование
      int i = 123; double d = i;
      System.out.println(i); // 123
      System.out.println(d); // 123.0
      d = 3.1415; i = (int)d;
      System.out.println(d); // 3.1415
      System.out.println(i); // 3
      // Явное преобразование (используется обёртка)
      byte b = Byte.parseByte("123");
      System.out.println(b); // 123
      // Нельзя "затолкать" в переменную больше, чем объём её типа
      // b = Byte.parseByte("1234");
      // System.out.println(b); // NumberFormatException: Value out of range. Value:"1234"

      // НО !!! Нельзя положить массив целых чисел в массив вещественных чисел напрямую
      // int[] a = new int[10];
      // double[] d = a; // Ошибка: Type mismatch: cannot convert from int[] to double[]
      // Подробнее - гуглить инаврианты, ковариантность и контрвариантность

   }
}
