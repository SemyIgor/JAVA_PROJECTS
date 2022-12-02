package Seminar03;

import java.util.ArrayList;
import java.util.Collections;

public class Sem03Task01 {
   /*
    * Заполнить список десятью случайными числами.
    * Отсортировать список методом sort() и вывести его на экран.
    */
   // public static void main(String[] args) {
   // }
   public void randomNumberList() {
      ArrayList<Double> number = new ArrayList<Double>();
      for (int i = 0; i < 10; i++) {
         number.add(Math.random());
      }
      System.out.println(number);
      Collections.sort(number);
      System.out.println(number);
      System.out.println(number.get(1));
   }
}
