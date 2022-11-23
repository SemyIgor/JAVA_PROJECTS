import java.io.FileReader;

public class program16 {
   public static void main(String[] args) throws Exception {
      // Сообщаем, что возможно выбрасывание исключений (throws Exception)
      // Эта конструкция может использоваться вместо try...catch
      // РАБОТА С ФАЙЛАМИ (начала)
      // Чтение, вариант посимвольно
      FileReader fr = new FileReader("file.txt");
      int c;
      while ((c = fr.read()) != -1) {
         char ch = (char) c;
         if (ch == '\n') {
            System.out.print(ch);
         } else {
            System.out.print(ch);
         }
      }
      fr.close();
   }
}
