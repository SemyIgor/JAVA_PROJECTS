package Seminar04;

import java.util.LinkedList;
// import java.util.Queue;
import java.util.Scanner;

public class HWTask02 {
   public static void main(String[] args) {
      LinkedList<String> dogsLine = new LinkedList<>();

      String mumsDog = new String("Pupsic");
      String dadsDog = new String("Kurgan");
      String sistersDog = new String("Vanci");
      String auntsDog = new String("Nifa");

      dogsLine.add(mumsDog);
      dogsLine.add(dadsDog);
      dogsLine.add(sistersDog);
      dogsLine.add(auntsDog);

      String str;
      System.out.print("\033[H\033[J");
      do {
         Scanner in = new Scanner(System.in);
         System.out.printf("Введите enq(element) для добавления его в конец очереди\n");
         System.out.printf("Введите deq() для удаления элемента из начала очереди\n");
         System.out.printf("Введите first() для просмотра первого элемента очереди\n");
         System.out.printf("Введите print() для вывода в терминал очереди\n");
         System.out.printf("Введите q или Q для выхода из программы\n");
         str = in.next();

         // Prints queue
         if (str.trim().equals("print()")) {
            print(dogsLine);
            // Adds element to the end of the queue
         } else if (str.startsWith("enq")) {
            enqueue(str, dogsLine);
            // Removes element from the start of the queue
         } else if (str.trim().equals("deq()")) {
            System.out.printf("Удалили %s\n", dequeue(dogsLine));
            // Returns the first element of the queue
         } else if (str.trim().equals("first()")) {
            System.out.printf("Первый элемент %s\n", first(dogsLine));
         } else {
            System.out.print("\033[H\033[J");
            continue;
         }
      } while (!str.equals("q") && !str.equals("Q"));

   }

   static void print(LinkedList<String> dogs) {
      // Очистка консоли
      System.out.print("\033[H\033[J");
      System.out.println(dogs);
   }

   static void enqueue(String elem, LinkedList<String> dogs) {
      // Очистка консоли
      System.out.print("\033[H\033[J");
      elem = elem.substring(elem.indexOf("(") + 1, elem.indexOf(")"));
      dogs.add(elem);
   }

   static String dequeue(LinkedList<String> dogs) {
      // Очистка консоли
      System.out.print("\033[H\033[J");
      return dogs.remove();
   }

   static String first(LinkedList<String> dogs) {
      // Очистка консоли
      System.out.print("\033[H\033[J");
      return dogs.get(0);

   }
}

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
 * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
 * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
 * удаляя.
 */