import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program15 {
   public static void main(String[] args) {
      // РАБОТА С ФАЙЛАМИ (начала)
      // Создание и запись / дозапись
      try (FileWriter fw = new FileWriter("file.txt", false)) {
         // false применяется для исключения попытки дописать в существующий файл
         // и заставляет создавать новый файл или перезаписывать старый, если такой файл
         // уже существует
         fw.write("line 1+");
         fw.append('\n');
         fw.append('2');
         fw.append('\n');
         fw.write("line 3");
         fw.flush();

         // Читаем файл построчно
         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
         String str;
         while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
            /*
             * Выводит в цикле строки файла:
             * == line 1+ ==
             * == 2 ==
             * == line 3 ==
             */
         }
         br.close();
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
