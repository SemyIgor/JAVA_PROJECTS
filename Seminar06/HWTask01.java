package Seminar06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HWTask01 {
   public static void main(String[] args) {
      Notebook note01 = new Notebook("Intel", "Irbis NB283", "2021", 4, 128, "Серый");
      note01.setPrice(19199);
      note01.setOperatingSystem("Windows 10 Pro");
      note01.setInStock(true);

      Notebook note02 = new Notebook("Intel", "Irbis NB275", "2021", 4, 128, "Чёрный");
      note02.setPrice(22999);
      note02.setOperatingSystem("Windows 10 Home Single Language");
      note02.setInStock(true);

      Notebook note03 = new Notebook("AMD", "Lenovo V15 ADA", "2020", 4, 256, "Серый");
      note03.setPrice(25199);
      note03.setOperatingSystem("без ОС");
      note03.setInStock(true);

      Notebook note04 = new Notebook("Infinix Mobile", "Infinix InBook X2 XL23", "2022", 8, 512, "Зелёный");
      note04.setPrice(44999);
      note04.setOperatingSystem("Windows 11 Home");
      note04.setInStock(true);

      Notebook note05 = new Notebook("AMD", "HP 255 G8", "2021", 8, 512, "Серый");
      note05.setPrice(23999);
      note05.setOperatingSystem("Windows 10 Home Single Language");
      note05.setInStock(false);

      Notebook note06 = new Notebook("Huawei", "Honor MagicBook Pro HLY-W19R", "2020", 8, 512, "Синий");
      note06.setPrice(36999);
      note06.setOperatingSystem("Windows 10 Home Single Language");
      note06.setInStock(false);

      Notebook note07 = new Notebook("Guangzhou ZIMAI Technology", "Maibenben M547", "2022", 16, 512, "Серебристый");
      note07.setPrice(42999);
      note07.setOperatingSystem("без ОС");
      note07.setInStock(true);

      Notebook note08 = new Notebook("AsusTek Computer Inc.", "ASUS VivoBook 17 F712EA-BX368", "2021", 8, 256,
            "Серебристый");
      note08.setPrice(33299);
      note08.setOperatingSystem("без ОС");
      note08.setInStock(true);

      Notebook note09 = new Notebook("Acer Inc.", "Acer Aspire 3 A315-23-R4B9", "2020", 8, 256, "Чёрный");
      note09.setPrice(33999);
      note09.setOperatingSystem("без ОС");
      note09.setInStock(true);

      Notebook note10 = new Notebook("AsusTek Computer Inc.", "ASUS VivoBook 14 K413EP-EK368", "2021", 8, 256,
            "Чёрный");
      note10.setPrice(46799);
      note10.setOperatingSystem("без ОС");
      note10.setInStock(true);

      HashSet<Notebook> notesSet = new HashSet<>();
      notesSet.add(note01);
      notesSet.add(note02);
      notesSet.add(note03);
      notesSet.add(note04);
      notesSet.add(note05);
      notesSet.add(note06);
      notesSet.add(note07);
      notesSet.add(note08);
      notesSet.add(note09);
      notesSet.add(note10);

      HashSet<Notebook> chosenNoteSet = new HashSet<>();

      HashMap<Integer, Object> choseCriteria = new HashMap<>();
      choseCriteria.put(1, 0);
      choseCriteria.put(2, 0);
      choseCriteria.put(3, "");
      choseCriteria.put(4, "");

      ArrayList<String> opSysList = new ArrayList<>();
      opSysList.add("Windows 10 Pro");
      opSysList.add("Windows 10 Home Single Language");
      opSysList.add("Windows 11 Home");
      opSysList.add("без ОС");

      ArrayList<String> noteColorList = new ArrayList<>();
      noteColorList.add("Серый");
      noteColorList.add("Чёрный");
      noteColorList.add("Зелёный");
      noteColorList.add("Синий");
      noteColorList.add("Серебристый");

      int ram;
      int hdd;
      int opSystemInd;
      int colorInd;
      // Clear screen
      System.out.print("\033[H\033[J");
      Scanner in = new Scanner(System.in);

      System.out.printf("ВНИМАНИЕ ! Для исключения очередного параметра поиска вводите 0\n");

      System.out.printf("Введите минимальный размер ОЗУ (или 0)\n");
      ram = in.nextInt();
      choseCriteria.put(1, ram);

      System.out.printf("Введите минимальныый объём накопителя (или 0)\n");
      hdd = in.nextInt();
      choseCriteria.put(2, hdd);

      System.out.printf("Введите число, определяющее операционную систему (или 0)\n");
      for (int i = 1; i <= opSysList.size(); i++) {
         System.out.printf("%d - %s\n", i, opSysList.get(i - 1));
      }
      opSystemInd = in.nextInt();
      if (opSystemInd == 0) {
         choseCriteria.put(3, "0");
      } else {
         choseCriteria.put(3, opSysList.get(opSystemInd - 1));
      }

      System.out.printf("Введите желаемый цвет ноутбука (или 0)\n");
      for (int i = 1; i <= noteColorList.size(); i++) {
         System.out.printf("%d - %s\n", i, noteColorList.get(i - 1));
      }
      colorInd = in.nextInt();
      if (colorInd == 0) {
         choseCriteria.put(4, "0");
      } else {
         choseCriteria.put(4, noteColorList.get(colorInd - 1));
      }

      in.close();
      System.out.println();

      for (Notebook note : notesSet) {
         if ((note.getDramSize() >= (Integer) choseCriteria.get(1)
               || (Integer) choseCriteria.get(1) == 0)
               && (note.getHddSize() >= (Integer) choseCriteria.get(2)
                     || (Integer) choseCriteria.get(2) == 0)
               && (choseCriteria.get(3) == "0"
                     || note.getOperatingSystem().equals(opSysList.get(opSystemInd - 1)))
               && (choseCriteria.get(4) == "0"
                     || note.getColor().equals(noteColorList.get(colorInd - 1)))) {
            // Prints chosen notebooks
            chosenNoteSet.add(note);
         }
      }
      if (chosenNoteSet.isEmpty()) {
         System.out.println("Ноутбуков с выбранными Вами параметрами не обнаружено");
      } else {
         for (Notebook notebook : chosenNoteSet) {
            System.out.println(notebook);
         }
      }
   }
}

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
 * фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */