package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HWTask01 {
   public static void main(String[] args) {
      /*
       * Реализовать алгоритм сортировки слиянием
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

      // Converts list to array
      int[] someIntArray = someIntList.stream().mapToInt(Integer::intValue).toArray();
      int[] result = mergeSort(someIntArray);

      System.out.println("\nОтсортированный массив:");
      System.out.println(Arrays.toString(result));
   }

   public static int[] mergeSort(int[] someIntArray) {
      int[] buffer1 = Arrays.copyOf(someIntArray, someIntArray.length);
      int[] buffer2 = new int[someIntArray.length];
      int[] result = mergeSortInner(buffer1, buffer2, 0, someIntArray.length);
      return result;
   }

   public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
      if (startIndex >= endIndex - 1) {
         return buffer1;
      }

      // sorted
      int middle = startIndex + (endIndex - startIndex) / 2;
      int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
      int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

      // merger
      int index1 = startIndex;
      int index2 = middle;
      int destIndex = startIndex;
      int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
      while (index1 < middle && index2 < endIndex) {
         result[destIndex++] = sorted1[index1] < sorted2[index2]
               ? sorted1[index1++]
               : sorted2[index2++];
      }
      while (index1 < middle) {
         result[destIndex++] = sorted1[index1++];
      }
      while (index2 < endIndex) {
         result[destIndex++] = sorted2[index2++];
      }
      return result;
   }

   // --------------------------------------------------------------
   static int GenerateRandInteger(int minValue, int maxValue) {
      // return (int) ((Math.random() * (maxValue - minValue)) + minValue);
      Random random = new Random();
      return random.nextInt(maxValue - minValue) + minValue;
   }
}
