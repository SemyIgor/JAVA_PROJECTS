package Seminar05;

import java.util.ArrayList;
import java.util.TreeMap;

public class ThirdProblem {

   public void sortedMap(String input) {
      // Создаём TreeMap, где ключ - целое, значение - список строк
      TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();

      // Получаем из разделённой пробелами строки, переданной в качестве параметра,
      // массив строк (массив всех слов фразы input)
      String[] s = input.split(" ");

      // Перебираем элементы полученного массива строк
      for (int i = 0; i < s.length; i++) {
         // Если в TreeMap имеется ключ, равный длине очередного элемента массива строк,
         if (treeMap.containsKey(s[i].length())) {

            // то по этому ключу (s[i].length()) получаем элемент (формируемый список слов)
            // и добавляет в него этот очередной элемент (s[i])
            treeMap.get(s[i].length()).add(s[i]);
            // А если нет такого ключа, то
         } else {
            // создаём для этого ключа список строк (слов) данной длины
            // (ЗНАЧЕНИЕ элемента treeMap у нас - это список строк (слов!))
            ArrayList<String> list = new ArrayList<>();
            // и заносим в этот список первое слово заданной длины из массива строк
            list.add(s[i]);
            // Заносим в TreeMap полученную пару ключ (длина элемента) :
            // значение (массив ArrayList, содержащий НУЛЕВОЙ элемент данной длины)
            treeMap.put(s[i].length(), list);
         }
      }
      System.out.println(treeMap.entrySet());
   }
}

/*
 * Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг
 * прелестный
 * Пора красавица проснись.
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
 * Строки с одинаковой длиной не должны “потеряться”.
 */