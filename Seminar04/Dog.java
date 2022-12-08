package Seminar04;

// import java.util.LinkedList;
// import java.util.Queue;

public class Dog {
   String name;
   String breed;
   int age;

   public Dog(String name, String breed, int age) {
      this.name = name;
      this.breed = breed;
      this.age = age;
   }

   public static void main(String[] args) {
      // Queue<Object> dogsLine = new LinkedList<>();

      Dog mumsDog = new Dog("Pupsic", "Tibetan Spaniel", 3);
      // Dog dadsDog = new Dog("Kurgan", "Swedish Vullhund", 4);
      // Dog sistersDog = new Dog("Vanci", "Skye Terrier", 1);
      // Dog auntsDog = new Dog("Nifa", "Pharaoh Hound", 2);

      System.out.println(mumsDog.name.toString());
      System.out.println(mumsDog.toString());
   }

   // dogsLine.push(mumsDog);
   // dogsLine.add(dadsDog);
   // dogsLine.add(sistersDog);
   // dogsLine.add(auntsDog);

   // System.out.println(dogsLine);
}
