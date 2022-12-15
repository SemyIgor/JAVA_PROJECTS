package Seminar05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HWTask01 {
   public static void main(String[] args) {
      Map<String, String> phonesMap = new HashMap<>();
      TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();

      String nameToFind = "Иванова";
      phonesMap.put("+7(286)5362773", "Иванова");
      phonesMap.put("+7(348)8940448", "Петров");
      phonesMap.put("+7(603)1322915", "Конюхов");
      phonesMap.put("+7(240)2615321", "Иванова");
      phonesMap.put("+7(124)2941317", "Ложечкин");
      phonesMap.put("+7(605)1448688", "Иванов");
      phonesMap.put("+7(666)9677425", "Петров");

      // Printing phonebook to the terminal
      for (var client : phonesMap.entrySet()) {
         System.out.printf("[%s: %s]\n", client.getKey(), client.getValue());
      }
      System.out.println();

      // Creating the list of the phones of the person to find
      ArrayList<String> phonesList = new ArrayList<>();

      // Getting entries which are the equals to the nameToFind - variable
      for (Map.Entry<String, String> clientsName : phonesMap.entrySet()) {
         if (clientsName.getValue().equals(nameToFind)) {
            phonesList.add(clientsName.getKey());
         }
      }
      treeMap.put(nameToFind, phonesList);
      System.out.println(treeMap.entrySet());
   }
}

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 */