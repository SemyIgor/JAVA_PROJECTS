import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sem02Task05 {

   public static void main(String[] args) throws IOException {
      writer();
   }

   // Populates a list of files for the specified category
   public static ArrayList<String> getFiles() {
      Logger logger = Logger.getLogger(Sem02Task05.class.getName());
      try {
         ArrayList<String> names;
         File file = new File("J:\\ДОМ\\РАБОТА\\ОТ\\Портал обучения"); // Writes directory to file "s02t05.txt"
         names = new ArrayList<String>(Arrays.asList(file.list()));
         return names;
      } catch (NullPointerException nullPointerException) {
         logger.log(Level.INFO, "Файлы не найдены в этой папке");
      }
      return null;
   }

   public static void writer() throws IOException {
      Logger logger = Logger.getLogger(Sem02Task05.class.getName());
      try {
         FileOutputStream fileOutputStream = new FileOutputStream("s02t05.txt");
         ArrayList<String> files = getFiles();
         for (String file : files) {
            file += "\n";
            fileOutputStream.write(file.getBytes());
         }
         fileOutputStream.close();
      } catch (NullPointerException nullPointerException) {
         logger.log(Level.WARNING, "В предыдущем методе файл вернул null", nullPointerException);
      }
   }
}
