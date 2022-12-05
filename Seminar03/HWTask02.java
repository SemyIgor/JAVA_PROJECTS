package Seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HWTask02 {
   public static void main(String[] args) {
      /*
       * Пусть дан произвольный список целых чисел, удалить из него четные числа
       */
      ArrayList<Integer> someIntList = new ArrayList<>();
      int lengthMinValue = 10;
      int lengthMaxValue = 50;
      int itemMinValue = 10;
      int itemMaxValue = 99;

      // Creats some list of integers
      int lengthOfList = GenerateRandInteger(lengthMinValue, lengthMaxValue + 1);
      for (int i = 0; i < lengthOfList; i++) {
         someIntList.add(GenerateRandInteger(itemMinValue, itemMaxValue + 1));
      }
      System.out.println("\nСгенерированный массив:");
      System.out.println(someIntList);

      // Removes even items of the list
      Iterator<Integer> iterator = someIntList.iterator();
      while (iterator.hasNext()) {
         if (iterator.next() % 2 == 0) {
            iterator.remove();
         }
      }

      System.out.println("\nМассив после удаления чётных чисел:");
      System.out.println(someIntList);

   }

   static int GenerateRandInteger(int minValue, int maxValue) {
      // return (int) ((Math.random() * (maxValue - minValue)) + minValue);
      Random random = new Random();
      return random.nextInt(maxValue - minValue) + minValue;
   }
}
