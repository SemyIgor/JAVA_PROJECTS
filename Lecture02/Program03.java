package Lecture02;

import java.io.File;

public class Program03 {
   public static void main(String[] args) {
      // РАБОТА С ФАЙЛАМИ
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/file.txt");
      File f3 = new File(pathFile);
      System.out.println(f3.getAbsolutePath());
      // /Users/sk/vscode/java_projects/file.txt
      // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
   }
}
