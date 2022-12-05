package Seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HWTask03 {
   public static void main(String[] args) {
      /*
       * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
       * среднее из этого списка.
       */
      ArrayList<Integer> someIntList = new ArrayList<>();
      int lengthMinValue = 5;
      int lengthMaxValue = 10;
      int itemMinValue = 10;
      int itemMaxValue = 99;

      // Creats some list of integers
      int lengthOfList = GenerateRandInteger(lengthMinValue, lengthMaxValue + 1);
      for (int i = 0; i < lengthOfList; i++) {
         someIntList.add(GenerateRandInteger(itemMinValue, itemMaxValue + 1));
      }
      System.out.println("\nСгенерированный массив:");
      System.out.println(someIntList);

      Collections.sort(someIntList);
      System.out.println("\nОтсортированный массив:");
      System.out.println(someIntList);

      PrintFirstElementList(someIntList);
      PrintLastElementList(someIntList);
      PrintMiddleElementList(someIntList);
      PrintMiddleElementListEnhanced(someIntList);

   }

   static int GenerateRandInteger(int minValue, int maxValue) {
      // return (int) ((Math.random() * (maxValue - minValue)) + minValue);
      Random random = new Random();
      return random.nextInt(maxValue - minValue) + minValue;
   }

   static void PrintFirstElementList(ArrayList<Integer> list) {
      // System.out.println(list.get(0));
      System.out.printf("\nМинимальный элемент массива = %d",
            list.get(0));
   }

   static void PrintLastElementList(ArrayList<Integer> list) {
      System.out.printf("\nМаксимальный элемент массива = %d",
            list.get(list.size() - 1));
   }

   static void PrintMiddleElementList(ArrayList<Integer> list) {

      System.out.printf("\nСредний элемент массива = %d",
            list.get(list.size() / 2));
   }

   static void PrintMiddleElementListEnhanced(ArrayList<Integer> list) {
      Double middleEnhanced;
      if (list.size() % 2 == 0) {
         middleEnhanced = Double
               .valueOf(((list.get(list.size() / 2)) + Double.valueOf(list.get(list.size() / 2 - 1))) / 2);
      } else {
         middleEnhanced = Double.valueOf(list.get(list.size() / 2));
      }
      System.out.printf("\nСредний уточнённый элемент массива = %.2f", middleEnhanced);
   }

}
