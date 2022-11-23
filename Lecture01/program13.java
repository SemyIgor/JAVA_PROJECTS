public class program13 {
   public static void main(String[] args) {
      // УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
      // Условный оператор
      int a = 1, b = 2, c;
      if (a > b) {
         c = a;
      } else {
         c = b;
      }
      System.out.println(c);
      // Сокращенная форма условного оператора
      if (a > b)
         c = a;
      if (b > a)
         c = b;
      System.out.println(c);
      // Тернарный оператор
      int min = a < b ? a : b;
      System.out.println(min);
      // Оператор выбора
      int month = 8;
      switch (month) {
         case 1:
         case 2:
         case 12:
            System.out.println("Это зима !");
            break;
         case 3:
         case 4:
         case 5:
            System.out.println("Это весна !");
            break;
         case 6:
         case 7:
         case 8:
            System.out.println("Это лето !");
            break;
         case 9:
         case 10:
         case 11:
            System.out.println("Это зима");
            break;
         default:
            System.out.println("Это другая планета !!!");
            break;
      }
   }
}
