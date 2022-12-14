package Seminar05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HWTask02 {
   public static void main(String[] args) {
      List<String> namesList = new ArrayList<>();
      namesList.add("Иванов");
      namesList.add("Петров");
      namesList.add("Сидоров");
      namesList.add("Иванов");
      namesList.add("Николаев");
      namesList.add("Сергеев");
      namesList.add("Фёдоров");
      namesList.add("Петров");
      namesList.add("Степанов");
      namesList.add("Петров");
      namesList.add("Григорьев");
      namesList.add("Фёдоров");
      namesList.add("Сергеев");
      namesList.add("Петров");
      namesList.add("Иванов");
      Map<String, Integer> employeeMap = new HashMap<>();

      // Filling hashmap
      for (String name : namesList) {
         if (employeeMap.containsKey(name)) {
            employeeMap.put(name, employeeMap.get(name) + 1);
         } else {
            employeeMap.put(name, 1);
         }
      }

      // Creating the rateList
      // =====================================================================================
      List<Integer> rateList = new ArrayList<>();

      for (int item : employeeMap.values()) {
         rateList.add(item);
      }

      // Sorting the ratelist
      Collections.sort(rateList);
      // Returning the rateList, sorted in descending order
      Collections.reverse(rateList); // [4, 3, 2, 2, 1, 1, 1, 1]
      // -------------------------------------------------------------------------------------

      Map<String, Integer> employeeLinkedMap = new LinkedHashMap<>();

      for (Integer item : rateList) {
         for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            if (item.equals(entry.getValue())) {
               employeeLinkedMap.put(entry.getKey(), entry.getValue());
            }
         }
      }
      // System.out.println(employeeLinkedMap);
      for (Map.Entry<String, Integer> entry : employeeLinkedMap.entrySet()) {
         System.out.println(entry);
      }

   }
}

/*
 * Пусть дан список сотрудников:Иван Иванов Написать программу, которая найдет и
 * выведет повторяющиеся имена с количеством повторений. Отсортировать по
 * убыванию популярности.
 */