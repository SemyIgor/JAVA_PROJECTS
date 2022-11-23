import java.util.Scanner;

public class program07 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("int a: ");
      boolean flag = iScanner.hasNextInt(); // Проверяет, действительно ли пользователь ввёл int
      if (flag){
         System.out.println(flag);
         int i = iScanner.nextInt();
         System.out.println(i);
      }
      iScanner.close();
   }
}
