package Lecture02;

import java.io.File;

public class program05 {
   public static void main(String[] args) {
      // СОЗДАНИЕ КАТАЛОГА (ПАПКИ)
      String pathProject = System.getProperty("user.dir");
      String pathDir = pathProject.concat("/files");
      File dir = new File(pathDir);
      System.out.println(dir.getAbsolutePath());
      if (dir.mkdir()) {
         System.out.println("+");
      } else {
         System.out.println("-");
      }
      for (String fname : dir.list()) {
         System.out.println(fname);
      }
   }
}
