package Seminar04;

import java.util.LinkedList;

public class HWTask01 {
   public static void main(String[] args) {

      LinkedList<String> listInit = new LinkedList<>();
      LinkedList<String> listTemp = new LinkedList<>();

      String string1 = new String("you?");
      String string2 = new String("are");
      String string3 = new String("How");
      String string4 = new String("Hi!");

      listInit.add(string1);
      listInit.add(string2);
      listInit.add(string3);
      listInit.add(string4);

      System.out.printf("%s - исходный двусвязный список\n", listInit);
      while (listInit.peek() != null) {
         listTemp.add(listInit.pollLast());
      }
      listInit = listTemp;

      System.out.printf("%s - вспомогательный двусвязный список\n", listTemp);
      System.out.printf("%s - полученный двусвязный список\n", listInit);
   }
}

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 */
