public class program09 {
   public static void main(String[] args) {
      /* 
      РАСТОЧИТЕЛЬНАЯ КОНКАТЕНАЦИЯ СТРОК
      При выполнении этого кода в памяти будет сформировано 4 строки: 
      1. s ("que")
      2. a ("123") - неявное преобразование
      3. s + a - формируемая новая строка во временной памяти
      4. q - результат формирования новой строки
      */
      String s = "que";
      int a = 123;
      String q = s + a;
      System.out.println(q); // "qwe123"
   }
}
