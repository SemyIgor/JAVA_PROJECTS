package Seminar05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HWTask01 {
   public static void main(String[] args) {
      Map<String, String> tf = new HashMap<>();
      Map<String, String> linkedHashMap = new LinkedHashMap<>();
      String nameToFind = "Иванова";
      tf.put("+7(286)5362773", "Иванова");
      tf.put("+7(348)8940448", "Петров");
      tf.put("+7(603)1322915", "Конюхов");
      tf.put("+7(240)2615321", "Иванова");
      tf.put("+7(124)2941317", "Ложечкин");
      tf.put("+7(605)1448688", "Иванов");
      tf.put("+7(666)9677425", "Петров");

      // Prints phonebook to terminal
      for (var client : tf.entrySet()) {
         System.out.printf("[%s: %s]\n", client.getKey(), client.getValue());
      }
      System.out.println();

      // Gets entries which are the equals to the nameToFind - variable
      for (Map.Entry<String, String> clientsName : tf.entrySet()) {
         if (clientsName.getValue().equals(nameToFind)) {
            linkedHashMap.put(clientsName.getKey(), clientsName.getValue());
         }
      }
      // Prints chosen entries
      System.out.println(linkedHashMap);
   }
}

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 */