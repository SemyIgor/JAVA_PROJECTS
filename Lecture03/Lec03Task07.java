package Lecture03;

import java.util.Iterator;
import java.util.List;

public class Lec03Task07 {
   public static void main(String[] args) {
      List<Integer> list = List.of(1, 12, 123, 1234, 12345);

      for (int item : list) {
         System.out.println(item);
      }

      Iterator<Integer> col = list.iterator();
      System.out.println();

      while (col.hasNext()) {
         System.out.println(col.next());
         /*
          * col.remove(); - ошибка (нельзя удалять элемент из списка,
          * полученного через List.of())
          */
         // col.next(); Ошибка, так как указатель переместился при первом вызове, а в
         // наличии следующего элемента мы не убедились (col.hasNext())
      }
   }
}
