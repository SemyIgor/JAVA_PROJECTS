public class program08 {
   public static void main(String[] args) {
      /*
       ФОРМАТИРОВАННЫЙ ВЫВОД 
       Виды спецификаторов:
       %d - целочисленных значений
       %x - шестнадцатиричных чисел
       %f - числа с плавающей точкой
       %e - числа в экспоненциальной форме (Например: 3.1415e+01, что соответствует 3.1415*10)
       %c - одиночный символ
       %s - строковое значение
      */
      int a = 1, b = 2;
      int c = a + b;
      String res = a + " + " + b + " = " + c + "\n";
      System.out.println(res);
      res = String.format("%d + %d = %d \n", a, b, c); // Сохраняем форматированную строку в переменную
      System.out.println(res);
      System.out.printf("%d + %d = %d \n", a, b, c);
      System.out.println(3.1415e+01); // 31.415
   }
}
