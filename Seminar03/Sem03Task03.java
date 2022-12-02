package Seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
// import java.util.ListIterator;

public class Sem03Task03 {
   int count = 0;
   ArrayList<String> planets = new ArrayList<>();

   public void addPlanets() {
      planets.add("Меркурий");
      planets.add("Земля");
      planets.add("Земля");
      planets.add("Плутон");
      planets.add("Венера");
      planets.add("Марс");
      planets.add("Земля");
      planets.add("Венера");
      planets.add("Меркурий");
      planets.add("Юпитер");
      planets.add("Уран");
      planets.add("Венера");
      planets.add("Сатурн");
      planets.add("Нептун");
      planets.add("Земля");

      Iterator<String> iterator = planets.iterator();
      while (iterator.hasNext()) {
         if (Collections.frequency(planets, iterator.next()) > 1) {
            count++;
            iterator.remove();
         }
      }
      System.out.println(planets);
      System.out.println(count);
   }
}
/*
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */