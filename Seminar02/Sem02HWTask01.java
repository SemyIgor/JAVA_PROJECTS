import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Распарсить файл с логами из заданий, выполненных на семинаре, найти записи
// уровня INFO/DEBUG.

public class Sem02HWTask01 {

   public static void main(String[] args) {
      try {
         File file = new File("log.txt");
         Scanner fileReader = new Scanner(file);
         while (fileReader.hasNextLine()) {
            String oddLine = fileReader.nextLine();
            String evenLine = fileReader.nextLine();
            if (evenLine.startsWith("INFO") || evenLine.startsWith("DEBUG")) {
               System.out.println(oddLine);
               System.out.println(evenLine);
            }
         }
         fileReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("Файл не найден");
         // e.printStackTrace();
      }
   }

}
