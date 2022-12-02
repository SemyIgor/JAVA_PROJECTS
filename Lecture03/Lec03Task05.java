package Lecture03;

import java.util.ArrayList;

public class Lec03Task05 {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>(); // Если указать тип, то
      // объект будет принимать только указанный тип

      // ArrayList list = new ArrayList(); // Если не указывать тип, то, как объект,
      // принимает разные типы, но в терминале
      // будет выдавать предупреждения о "сыром" типе
      list.add(2809);
      list.add(1234);

      for (Object ob : list) {
         System.out.println(ob);
      }
   }
}
